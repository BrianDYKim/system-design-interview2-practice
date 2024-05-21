package team.me.chapter1.business.domain.entity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
class IBusiness private constructor(
    val businessId: Long?,
    val address: IBusinessAddress,
    val location: IBusinessGeoLocation,
) {
    companion object {
        fun generate(
            id: BusinessId,
            address: BusinessAddress,
            city: BusinessCity,
            state: BusinessState,
            country: BusinessCountry,
            latitude: BusinessLatitude,
            longitude: BusinessLongitude,
        ): IBusiness {
            val iAddress =
                IBusinessAddress.generate(
                    streetAddress = address.value,
                    city = city.value,
                    state = state.value,
                    country = country.value,
                )

            val iGeoLocation =
                IBusinessGeoLocation.generate(
                    latitude = latitude.value,
                    longitude = longitude.value,
                )

            return IBusiness(
                businessId = id.value,
                address = iAddress,
                location = iGeoLocation,
            )
        }

        data class BusinessId(val value: Long?)

        data class BusinessAddress(val value: String)

        data class BusinessCity(val value: String)

        data class BusinessState(val value: String)

        data class BusinessCountry(val value: String)

        data class BusinessLatitude(val value: Double)

        data class BusinessLongitude(val value: Double)
    }
}
