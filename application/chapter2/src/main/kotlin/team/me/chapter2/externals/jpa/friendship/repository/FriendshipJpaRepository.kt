package team.me.chapter2.externals.jpa.friendship.repository

import org.springframework.data.jpa.repository.JpaRepository
import team.me.chapter2.externals.jpa.friendship.entity.FriendshipJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
interface FriendshipJpaRepository : JpaRepository<FriendshipJpaEntity, Long>, FriendshipCustomJpaRepository
