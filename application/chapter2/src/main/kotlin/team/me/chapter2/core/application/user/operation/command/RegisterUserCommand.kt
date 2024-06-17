package team.me.chapter2.core.application.user.operation.command

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.Length
import team.me.common.validate.SelfValidating

data class RegisterUserCommand(
    @field:NotNull
    @field:NotBlank
    val name: String,
    @field:NotNull
    @field:NotBlank
    @field:Email
    val email: String,
    @field:NotNull
    @field:Length(min = 8, max = 20)
    val password: String,
    @field:NotNull
    @field:NotEmpty
    val phoneNumber: String,
) : SelfValidating<RegisterUserCommand>() {
    init {
        validateSelf()
    }
}
