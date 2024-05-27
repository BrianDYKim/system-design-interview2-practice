package team.me.chapter1.business.infrastructure.jpa.business.repository.business

import com.querydsl.jpa.impl.JPAQueryFactory
import team.me.chapter1.business.infrastructure.jpa.business.entity.BusinessJpaEntity
import team.me.chapter1.business.infrastructure.jpa.business.entity.QBusinessJpaEntity
import team.me.common.annotations.hexagonal.PersistenceAdapter

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@PersistenceAdapter
class BusinessJpaRepositoryImpl(
    private val queryFactory: JPAQueryFactory,
) : BusinessJpaCustomRepository {
    override fun findByIdList(idList: List<Long>): List<BusinessJpaEntity> {
        val qBusinessJpaEntity = QBusinessJpaEntity.businessJpaEntity

        return queryFactory.selectFrom(qBusinessJpaEntity)
            .where(qBusinessJpaEntity.id.`in`(idList))
            .fetch()
    }
}
