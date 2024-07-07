package team.me.chapter2.core.application.friendship.mapper

import org.springframework.stereotype.Component
import team.me.chapter2.core.domain.friendship.entity.IFriendship
import team.me.chapter2.externals.jpa.friendship.entity.FriendshipJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Component
class FriendshipJpaEntityToDomainMapper {
    fun transform(friendshipJpaEntity: FriendshipJpaEntity): IFriendship =
        with(friendshipJpaEntity) {
            IFriendship.generate(
                friendshipId = IFriendship.Companion.FriendshipId(id!!),
                fromUserId = IFriendship.Companion.FromUserId(from),
                toUserId = IFriendship.Companion.ToUserId(to),
            )
        }
}
