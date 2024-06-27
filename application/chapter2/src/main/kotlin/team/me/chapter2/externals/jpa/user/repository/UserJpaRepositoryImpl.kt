package team.me.chapter2.externals.jpa.user.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import team.me.common.annotations.hexagonal.PersistenceAdapter

@PersistenceAdapter
class UserJpaRepositoryImpl(
    private val queryFactory: JPAQueryFactory,
) : UserCustomJpaRepository
