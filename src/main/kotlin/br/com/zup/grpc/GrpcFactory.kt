package br.com.zup.grpc

import br.com.zup.KeyManagerGrpcServiceGrpc
import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class GrpcFactory(
    @GrpcChannel("localhost:50051") val channel: ManagedChannel
) {
    @Singleton
    fun pixServerGrpc() = KeyManagerGrpcServiceGrpc.newBlockingStub(channel)
}