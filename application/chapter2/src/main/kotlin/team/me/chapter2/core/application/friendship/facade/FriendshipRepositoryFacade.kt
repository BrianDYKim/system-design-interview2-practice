package team.me.chapter2.core.application.friendship.facade

import org.springframework.stereotype.Component
import team.me.chapter2.core.application.friendship.mapper.FriendshipJpaEntityToDomainMapper
import team.me.chapter2.core.domain.friendship.entity.IFriendship
import team.me.chapter2.core.domain.friendship.repository.IFriendshipRepository
import team.me.chapter2.externals.jpa.friendship.entity.FriendshipJpaEntity
import team.me.chapter2.externals.jpa.friendship.repository.FriendshipJpaRepository

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Component
class FriendshipRepositoryFacade(
    private val friendshipJpaRepository: FriendshipJpaRepository,
    private val jpaEntityToDomainMapper: FriendshipJpaEntityToDomainMapper,
) : IFriendshipRepository {
    override fun store(
        from: IFriendship.Companion.FromUserId,
        to: IFriendship.Companion.ToUserId,
    ): IFriendship {
        val friendshipJpaEntity =
            FriendshipJpaEntity.generate(
                id = null,
                from = from.value,
                to = to.value,
            )

        val storedFriendship = friendshipJpaRepository.save(friendshipJpaEntity)

        return jpaEntityToDomainMapper.transform(storedFriendship)
    }
}
