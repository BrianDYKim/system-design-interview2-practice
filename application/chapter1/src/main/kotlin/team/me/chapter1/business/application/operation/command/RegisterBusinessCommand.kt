package team.me.chapter1.business.application.operation.command

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import team.me.common.validate.SelfValidating

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
data class RegisterBusinessCommand(
    @field:NotNull @field:NotBlank
    val streetAddress: String,
    @field:NotNull @field:NotBlank
    val city: String,
    @field:NotNull @field:NotBlank
    val state: String,
    @field:NotNull @field:NotBlank
    val country: String,
    @field:Min(value = -90) @field:Max(value = 90)
    val latitude: Double,
    @field:Min(value = -180) @field:Max(value = 180)
    val longitude: Double,
) : SelfValidating<RegisterBusinessCommand>() {
    init {
        this.validateSelf()
    }
}
