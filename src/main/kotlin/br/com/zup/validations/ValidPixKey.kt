package br.com.zup.validations


import org.hibernate.validator.constraints.CompositionType
import org.hibernate.validator.constraints.ConstraintComposition
import kotlin.annotation.AnnotationTarget.*
import org.hibernate.validator.constraints.br.CPF
import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import javax.validation.constraints.Email
import javax.validation.constraints.Size
import kotlin.reflect.KClass

@CPF
@Size(max = 2)
@ConstraintComposition(CompositionType.OR)
@Retention(AnnotationRetention.RUNTIME)
@Target(FIELD, TYPE, CONSTRUCTOR)
@ReportAsSingleViolation
@MustBeDocumented
annotation class ValidPixKey(
    val message: String = "valor de chave inválido",
    val groups: Array<KClass<Any>> = [],
    val payload: Array<KClass<Any>> = []
)
