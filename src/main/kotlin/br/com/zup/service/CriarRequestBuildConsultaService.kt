package br.com.zup.service

import br.com.zup.ConsultaChavePixRequest
import br.com.zup.DadosPix
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Singleton

@Singleton
class CriarRequestBuildConsultaService {

    val logger = LoggerFactory.getLogger(this.javaClass)

    fun toRequestGRPC(clienteId: UUID, chavePix: String?, pixId: String?): ConsultaChavePixRequest {
        val requestBuild = when {
            (chavePix != null) -> {
                logger.info("Chave PIX: $chavePix")

                ConsultaChavePixRequest.newBuilder()
                    .setChavePix(chavePix)
                    .build()
            }
            (pixId != null) -> {
                logger.info("PIX ID: $pixId")

                ConsultaChavePixRequest.newBuilder()
                    .setDadosPix(DadosPix.newBuilder()
                        .setClienteId(clienteId.toString())
                        .setPixId(pixId)
                        .build())
                    .build()
            }
            else -> {
                throw IllegalArgumentException("você precisa informar sua chave pix ou o identificador da chave")
            }
        }

        return requestBuild
    }
}