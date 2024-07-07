package team.me.chapter2.externals.jpa.friendship.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import team.me.common.annotations.hexagonal.PersistenceAdapter

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@PersistenceAdapter
class FriendshipJpaRepositoryImpl(
    private val queryFactory: JPAQueryFactory,
) : FriendshipCustomJpaRepository
