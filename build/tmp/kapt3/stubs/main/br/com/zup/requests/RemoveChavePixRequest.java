package br.com.zup.requests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lbr/com/zup/requests/RemoveChavePixRequest;", "", "pixId", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "getPixId", "()Ljava/util/UUID;", "toRequestGRPC", "Lbr/com/zup/RemoveChavePixRequest;", "clienteId", "transacao"})
@io.micronaut.core.annotation.Introspected()
public final class RemoveChavePixRequest {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.util.UUID pixId = null;
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.RemoveChavePixRequest toRequestGRPC(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getPixId() {
        return null;
    }
    
    public RemoveChavePixRequest(@org.jetbrains.annotations.NotNull()
    java.util.UUID pixId) {
        super();
    }
}