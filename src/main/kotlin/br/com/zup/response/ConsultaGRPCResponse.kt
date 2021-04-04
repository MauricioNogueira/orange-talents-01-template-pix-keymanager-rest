package br.com.zup.response

import java.time.LocalDateTime

data class ConsultaGRPCResponse(
    val keyType: String?,
    val key: String?,
    val bankAccount: BankAccount?,
    val owner: Owner?
) {
    var createdAt: LocalDateTime? = null
}

data class BankAccount(
    val participant: String?,
    val branch: String?,
    val accountNumber: String?,
    val accountType: String?
) {

}

data class Owner(
    val type: String,
    val name: String,
    val taxIdNumber: String
) {

}