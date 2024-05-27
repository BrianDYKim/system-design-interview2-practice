package team.me.chapter1.business.application.dto

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
sealed class RegisterBusinessDto {
    data class Request(
        val streetAddress: String,
        val city: String,
        val state: String,
        val country: String,
        val latitude: Double,
        val longitude: Double,
    )

    data class Response(
        val id: Long,
        val streetAddress: String,
        val city: String,
        val state: String,
        val country: String,
        val latitude: Double,
        val longitude: Double,
    )
}
