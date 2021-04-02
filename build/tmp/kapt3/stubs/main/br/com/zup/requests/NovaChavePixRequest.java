package br.com.zup.requests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/requests/NovaChavePixRequest;", "", "tipoChave", "", "valorChave", "tipoConta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTipoChave", "()Ljava/lang/String;", "getTipoConta", "getValorChave", "toGrpcRequest", "Lbr/com/zup/NovaChavePixRequest;", "clienteId", "Ljava/util/UUID;", "toString", "transacao"})
@io.micronaut.core.annotation.Introspected()
public final class NovaChavePixRequest {
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String tipoChave = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotBlank()
    @javax.validation.constraints.Size(max = 77)
    private final java.lang.String valorChave = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String tipoConta = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.NovaChavePixRequest toGrpcRequest(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTipoChave() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getValorChave() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTipoConta() {
        return null;
    }
    
    public NovaChavePixRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String tipoChave, @org.jetbrains.annotations.Nullable()
    java.lang.String valorChave, @org.jetbrains.annotations.Nullable()
    java.lang.String tipoConta) {
        super();
    }
}