package team.me.chapter2.core.domain.friendship.repository

import team.me.chapter2.core.domain.friendship.entity.IFriendship

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
interface IFriendshipRepository {
    fun store(
        from: IFriendship.Companion.FromUserId,
        to: IFriendship.Companion.ToUserId,
    ): IFriendship
}
