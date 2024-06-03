package team.me.chapter1.business.application.dto

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
sealed class FindNearByBusinessDto {
    data class Response(
        val id: Long,
        val streetAddress: String,
        val city: String,
        val state: String,
        val country: String,
        val latitude: Double,
        val longitude: Double,
        val geoHash: String,
    )
}
