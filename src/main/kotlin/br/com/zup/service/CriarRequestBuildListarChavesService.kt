package br.com.zup.service

import br.com.zup.ListarChavePixRequest
import java.util.*
import javax.inject.Singleton

@Singleton
class CriarRequestBuildListarChavesService{
    fun toGRPCRequest(clienteId: UUID): ListarChavePixRequest {
        return ListarChavePixRequest.newBuilder()
            .setClienteId(clienteId.toString())
            .build()
    }
}