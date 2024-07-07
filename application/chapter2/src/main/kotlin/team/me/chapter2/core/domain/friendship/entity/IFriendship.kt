package team.me.chapter2.core.domain.friendship.entity

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
class IFriendship private constructor(
    val id: Long?,
    val from: Long,
    val to: Long,
) {
    companion object {
        fun generate(
            friendshipId: FriendshipId,
            fromUserId: FromUserId,
            toUserId: ToUserId,
        ) = IFriendship(
            id = friendshipId.value,
            from = fromUserId.value,
            to = toUserId.value,
        )

        @JvmInline
        value class FriendshipId(val value: Long?)

        @JvmInline
        value class FromUserId(val value: Long)

        @JvmInline
        value class ToUserId(val value: Long)
    }
}
