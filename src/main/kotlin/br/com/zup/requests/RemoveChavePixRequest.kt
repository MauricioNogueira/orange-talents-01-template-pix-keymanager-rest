package br.com.zup.requests

import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import br.com.zup.RemoveChavePixRequest

@Introspected
class RemoveChavePixRequest(

    @field:NotBlank
    val pixId: UUID
) {
    fun toRequestGRPC(clienteId: UUID): RemoveChavePixRequest? {
        return RemoveChavePixRequest.newBuilder()
            .setClienteId(clienteId.toString())
            .setPixId(pixId.toString())
            .build()
    }

}