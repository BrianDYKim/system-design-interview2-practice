package team.me.chapter1.business.application.operation.query

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import team.me.common.validate.SelfValidating

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
data class FindNearbyBusinessesQuery(
    @field:NotNull @field:NotBlank
    val geoHash: String,
) : SelfValidating<FindNearbyBusinessesQuery>() {
    init {
        this.validateSelf()
    }
}
