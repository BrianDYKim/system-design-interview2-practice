package team.me.chapter1.business.infrastructure.jpa.business.repository.business

import com.querydsl.jpa.impl.JPAQueryFactory
import team.me.chapter1.business.infrastructure.jpa.business.entity.BusinessJpaEntity
import team.me.chapter1.business.infrastructure.jpa.business.entity.QBusinessJpaEntity
import team.me.chapter1.business.infrastructure.jpa.business.entity.QGeoPartialIndexJpaEntity
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

    override fun findBusinessesByGeoHash(geoHash: String): List<BusinessJpaEntity> {
        val qBusinessJpaEntity = QBusinessJpaEntity.businessJpaEntity
        val qGeoPartialIndexJpaEntity = QGeoPartialIndexJpaEntity.geoPartialIndexJpaEntity

        return queryFactory.select(qBusinessJpaEntity)
            .from(qGeoPartialIndexJpaEntity)
            .innerJoin(qBusinessJpaEntity).on(qGeoPartialIndexJpaEntity.businessId.eq(qBusinessJpaEntity.id))
            .where(qGeoPartialIndexJpaEntity.geoHash.eq(geoHash))
            .fetch()
    }
}
