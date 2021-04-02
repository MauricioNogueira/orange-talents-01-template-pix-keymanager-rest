package br.com.zup.requests

import br.com.zup.NovaChavePixRequest
import br.com.zup.TipoChave
import br.com.zup.TipoConta
import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
class NovaChavePixRequest(

    @field:NotBlank
    val tipoChave: String?,

    @field:Size(max = 77)
    @field:NotBlank
    val valorChave: String?,

    @field:NotBlank
    val tipoConta: String?
) {
    override fun toString(): String {
        return "NovaChavePixRequest(tipoChave='$tipoChave', valorChave='$valorChave', tipoConta='$tipoConta')"
    }

    fun toGrpcRequest(clienteId: UUID): NovaChavePixRequest {
        return NovaChavePixRequest.newBuilder()
            .setIdentificadorCliente(clienteId.toString())
            .setTipoChave(TipoChave.valueOf(tipoChave ?: "UNKNOWN_TYPE"))
            .setValorChave(valorChave ?: "")
            .setTipoConta(TipoConta.valueOf(tipoConta ?: "UNKNOWN_ACCOUNT"))
            .build()
    }
}