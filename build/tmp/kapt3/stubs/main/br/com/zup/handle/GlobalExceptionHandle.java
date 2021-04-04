package br.com.zup.handle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/handle/GlobalExceptionHandle;", "Lio/micronaut/http/server/exceptions/ExceptionHandler;", "Lio/grpc/StatusRuntimeException;", "Lio/micronaut/http/HttpResponse;", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "handle", "request", "Lio/micronaut/http/HttpRequest;", "exception", "key-manager-grpc-rest"})
@io.micronaut.context.annotation.Requirements(value = {@io.micronaut.context.annotation.Requires(classes = {io.grpc.StatusRuntimeException.class, io.micronaut.http.server.exceptions.ExceptionHandler.class})})
@javax.inject.Singleton()
@io.micronaut.http.annotation.Produces()
public final class GlobalExceptionHandle implements io.micronaut.http.server.exceptions.ExceptionHandler<io.grpc.StatusRuntimeException, io.micronaut.http.HttpResponse<?>> {
    private final org.slf4j.Logger logger = null;
    
    public final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<?> handle(@org.jetbrains.annotations.Nullable()
    io.micronaut.http.HttpRequest<?> request, @org.jetbrains.annotations.Nullable()
    io.grpc.StatusRuntimeException exception) {
        return null;
    }
    
    public GlobalExceptionHandle() {
        super();
    }
}