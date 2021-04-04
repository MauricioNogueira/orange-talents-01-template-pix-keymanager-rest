package br.com.zup.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ,\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0017J\u001e\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0017R\u0010\u0010\u0004\u001a\u00020\u00058\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lbr/com/zup/controller/ClienteController;", "", "keyManagerGrpcClient", "Lbr/com/zup/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;", "consultarChavePixService", "Lbr/com/zup/service/CriarRequestBuildConsultaService;", "criarRequestBuildListarChavesService", "Lbr/com/zup/service/CriarRequestBuildListarChavesService;", "(Lbr/com/zup/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;Lbr/com/zup/service/CriarRequestBuildConsultaService;Lbr/com/zup/service/CriarRequestBuildListarChavesService;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "consultaChavePix", "Lio/micronaut/http/HttpResponse;", "clienteId", "Ljava/util/UUID;", "chavePix", "", "pixId", "listarChavesPix", "novaChave", "Lbr/com/zup/controller/Response;", "novaChavePixRequest", "Lbr/com/zup/requests/NovaChavePixRequest;", "removeChavePix", "request", "Lbr/com/zup/requests/RemoveChavePixRequest;", "key-manager-grpc-rest"})
@io.micronaut.http.annotation.Controller(value = "/api/clientes")
@io.micronaut.validation.Validated()
public class ClienteController {
    private final org.slf4j.Logger logger = null;
    @javax.inject.Inject()
    private final br.com.zup.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub keyManagerGrpcClient = null;
    @javax.inject.Inject()
    private final br.com.zup.service.CriarRequestBuildConsultaService consultarChavePixService = null;
    @javax.inject.Inject()
    private final br.com.zup.service.CriarRequestBuildListarChavesService criarRequestBuildListarChavesService = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{clienteId}/consultar-chave")
    public io.micronaut.http.HttpResponse<?> consultaChavePix(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId, @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String chavePix, @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String pixId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{clienteId}/listar-chaves-pix")
    public io.micronaut.http.HttpResponse<java.lang.Object> listarChavesPix(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.util.UUID clienteId) {
        return null;
    }
    
    public ClienteController(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub keyManagerGrpcClient, @org.jetbrains.annotations.NotNull()
    br.com.zup.service.CriarRequestBuildConsultaService consultarChavePixService, @org.jetbrains.annotations.NotNull()
    br.com.zup.service.CriarRequestBuildListarChavesService criarRequestBuildListarChavesService) {
        super();
    }
}