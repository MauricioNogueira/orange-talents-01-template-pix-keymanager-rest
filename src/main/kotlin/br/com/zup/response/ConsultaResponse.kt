package br.com.zup.response

import br.com.zup.ConsultaChavePixResponse
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset

class ConsultaResponse{

    fun converte(consultaChavePixResponse: ConsultaChavePixResponse): Map<String, Any> {


        val conta = mapOf(
            Pair("intituicao", consultaChavePixResponse.conta.instituicao),
            Pair("agencia", consultaChavePixResponse.conta.agencia),
            Pair("numero", consultaChavePixResponse.conta.numero),
            Pair("tipoConta", consultaChavePixResponse.conta.tipoConta)
        )

        val result = mapOf(
            Pair("pixId", consultaChavePixResponse.pixId),
            Pair("clienteId", consultaChavePixResponse.clienteId),
            Pair("tipoChave", consultaChavePixResponse.tipoChave),
            Pair("valorChave", consultaChavePixResponse.valorChave),
            Pair("titular", consultaChavePixResponse.titular),
            Pair("cpf", consultaChavePixResponse.cpf),
            Pair("conta", conta),
            Pair("criado", LocalDateTime.ofInstant(Instant.ofEpochSecond(consultaChavePixResponse.criado.seconds, consultaChavePixResponse.criado.nanos.toLong()), ZoneOffset.UTC))
        )

        return result
    }
}