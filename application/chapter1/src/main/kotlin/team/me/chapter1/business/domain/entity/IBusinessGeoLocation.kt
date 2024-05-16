package team.me.chapter1.business.domain.entity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
class IBusinessGeoLocation private constructor(
    val latitude: Double,
    val longitude: Double,
) {
    companion object {
        fun generate(
            latitude: Double,
            longitude: Double,
        ): IBusinessGeoLocation {
            return IBusinessGeoLocation(latitude, longitude)
        }
    }
}
