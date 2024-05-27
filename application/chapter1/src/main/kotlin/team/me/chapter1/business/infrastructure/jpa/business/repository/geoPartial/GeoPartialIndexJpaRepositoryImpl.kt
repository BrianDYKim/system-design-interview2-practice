package team.me.chapter1.business.infrastructure.jpa.business.repository.geoPartial

import com.querydsl.jpa.impl.JPAQueryFactory
import team.me.chapter1.business.infrastructure.jpa.business.entity.QGeoPartialIndexJpaEntity
import team.me.common.annotations.hexagonal.PersistenceAdapter

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@PersistenceAdapter
class GeoPartialIndexJpaRepositoryImpl(
    private val queryFactory: JPAQueryFactory,
) : GeoPartialIndexJpaCustomRepository {
    override fun findBusinessIdListByGeoHash(geoHash: String): List<Long> {
        val qGeoPartialIndexJpaEntity = QGeoPartialIndexJpaEntity.geoPartialIndexJpaEntity

        return queryFactory.select(qGeoPartialIndexJpaEntity.businessId)
            .where(qGeoPartialIndexJpaEntity.geoHash.eq(geoHash))
            .fetch()
    }
}
