package team.me.chapter2.core.application.friendship.dto

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
sealed class RegisterFriendshipDto {
    data class Request(
        val from: Long,
        val to: Long,
    )

    data class Response(
        val from: Long,
        val to: Long,
    )
}
