package br.com.zup.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0017R\u0010\u0010\u0002\u001a\u00020\u00038\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lbr/com/zup/controller/ClienteController;", "", "keyManagerGrpcClient", "Lbr/com/zup/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;", "(Lbr/com/zup/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "novaChave", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/controller/Response;", "clienteId", "Ljava/util/UUID;", "novaChavePixRequest", "Lbr/com/zup/requests/NovaChavePixRequest;", "removeChavePix", "request", "Lbr/com/zup/requests/RemoveChavePixRequest;", "transacao"})
@io.micronaut.http.annotation.Controller(value = "/api/clientes")
@io.micronaut.validation.Validated()
public class ClienteController {
    private final org.slf4j.Logger logger = null;
    @javax.inject.Inject()
    private final br.com.zup.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub keyManagerGrpcClient = null;
    
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/{clienteId}/nova-chave")
    public io.micronaut.http.HttpResponse<br.com.zup.controller.Response> novaChave(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    @javax.validation.Valid()
    br.com.zup.requests.NovaChavePixRequest novaChavePixRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/{clienteId}/remove-chave")
    public io.micronaut.http.HttpResponse<?> removeChavePix(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId, @org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.requests.RemoveChavePixRequest request) {
        return null;
    }
    
    public ClienteController(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub keyManagerGrpcClient) {
        super();
    }
}