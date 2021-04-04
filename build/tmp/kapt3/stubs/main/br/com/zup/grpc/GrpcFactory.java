package br.com.zup.grpc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lbr/com/zup/grpc/GrpcFactory;", "", "channel", "Lio/grpc/ManagedChannel;", "(Lio/grpc/ManagedChannel;)V", "getChannel", "()Lio/grpc/ManagedChannel;", "pixServerGrpc", "Lbr/com/zup/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;", "kotlin.jvm.PlatformType", "key-manager-grpc-rest"})
@io.micronaut.context.annotation.Factory()
public final class GrpcFactory {
    @org.jetbrains.annotations.NotNull()
    private final io.grpc.ManagedChannel channel = null;
    
    @javax.inject.Singleton()
    public final br.com.zup.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub pixServerGrpc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.grpc.ManagedChannel getChannel() {
        return null;
    }
    
    public GrpcFactory(@org.jetbrains.annotations.NotNull()
    @io.micronaut.grpc.annotation.GrpcChannel(value = "localhost:50051")
    io.grpc.ManagedChannel channel) {
        super();
    }
}