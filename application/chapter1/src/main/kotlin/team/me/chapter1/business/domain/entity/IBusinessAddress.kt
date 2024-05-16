package team.me.chapter1.business.domain.entity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
class IBusinessAddress private constructor(
    val streetAddress: String,
    val city: String,
    val state: String,
    val country: String,
) {
    companion object {
        fun generate(
            streetAddress: String,
            city: String,
            state: String,
            country: String,
        ): IBusinessAddress {
            return IBusinessAddress(streetAddress, city, state, country)
        }
    }
}
