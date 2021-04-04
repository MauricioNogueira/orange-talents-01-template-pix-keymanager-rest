package br.com.zup.controller

import br.com.zup.ConsultaChavePixResponse
import br.com.zup.KeyManagerGrpcServiceGrpc
import br.com.zup.NovaChavePixResponse
import br.com.zup.requests.NovaChavePixRequest
import br.com.zup.requests.RemoveChavePixRequest
import br.com.zup.response.ConsultaGRPCResponse
import br.com.zup.response.ConsultaResponse
import br.com.zup.service.CriarRequestBuildConsultaService
import br.com.zup.service.CriarRequestBuildListarChavesService
import com.google.gson.Gson
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import org.slf4j.LoggerFactory
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*
import javax.inject.Inject
import javax.validation.Valid

@Validated
@Controller("/api/clientes")
class ClienteController(
    @Inject private val keyManagerGrpcClient: KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub,
    @Inject private val consultarChavePixService: CriarRequestBuildConsultaService,
    @Inject private val criarRequestBuildListarChavesService: CriarRequestBuildListarChavesService
) {

    val logger = LoggerFactory.getLogger(this.javaClass)

    @Post("/{clienteId}/nova-chave")
    fun novaChave(clienteId: UUID, @Valid @Body novaChavePixRequest: NovaChavePixRequest): HttpResponse<Response> {
        val grpcNovaChaveRequest = novaChavePixRequest.toGrpcRequest(clienteId = clienteId)

        val response: NovaChavePixResponse = keyManagerGrpcClient.novaChavePix(grpcNovaChaveRequest)

        logger.info("Chave pix do cliente ID: ${response.clienteId} foi criada")

        return HttpResponse.created(Response(message = "Chave criada com sucesso", data = DataChavePix(clienteId = response.clienteId, pixId = response.chavePix)))
    }

    @Delete("/{clienteId}/remove-chave")
    fun removeChavePix(clienteId: UUID, @Body @Valid request: RemoveChavePixRequest): HttpResponse<*> {

        val requestBuild = request.toRequestGRPC(clienteId)

        keyManagerGrpcClient.removeChavePix(requestBuild)

        logger.info("chave pix foi removida com sucesso")

        return HttpResponse.ok<Any>()
    }

    @Get("/{clienteId}/consultar-chave")
    fun consultaChavePix(clienteId: UUID, @QueryValue chavePix: String?, @QueryValue pixId: String?): HttpResponse<*> {
        val requestBuild = this.consultarChavePixService.toRequestGRPC(clienteId, chavePix, pixId)

        val response: ConsultaChavePixResponse = this.keyManagerGrpcClient.consultaChavePix(requestBuild)

        logger.info("consulta da chave pix do cliente $clienteId foi realizada com sucesso")

        return HttpResponse.ok(ConsultaResponse().converte(response))
    }

    @Get("/{clienteId}/listar-chaves-pix")
    fun listarChavesPix(@PathVariable clienteId: UUID): HttpResponse<Any> {
        val requestBuild = this.criarRequestBuildListarChavesService.toGRPCRequest(clienteId)

        val response = this.keyManagerGrpcClient.listarChavePix(requestBuild)

        val lista = mutableListOf<Any>()

        response.chavesPixList.forEach { chave ->
            lista.add(ChavePixInfo(
                clienteId = chave.clienteId,
                tipoChave = chave.tipoChave,
                valorChave = chave.valorChave,
                tipoConta = chave.tipoConta.name,
                criacaoChave = LocalDateTime.ofInstant(Instant.ofEpochSecond(chave.criacaoChave.seconds, chave.criacaoChave.nanos.toLong()), ZoneOffset.UTC)
            ))
        }

        logger.info("listagem de chaves pix do cliente $clienteId foi realizada com sucesso")

        return HttpResponse.ok(lista)
    }
}

// Cadastro de chave PIX
data class Response(val message: String, val data: DataChavePix) {}
data class DataChavePix(val clienteId: String, val pixId: String) {}

data class ChavePixInfo(val clienteId: String, val tipoChave: String, val valorChave: String, val tipoConta: String, val criacaoChave: LocalDateTime) {}