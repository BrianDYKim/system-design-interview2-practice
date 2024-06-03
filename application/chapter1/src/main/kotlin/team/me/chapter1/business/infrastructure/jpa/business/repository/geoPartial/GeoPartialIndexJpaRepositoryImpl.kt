package team.me.chapter1.business.infrastructure.jpa.business.repository.geoPartial

import com.querydsl.jpa.impl.JPAQueryFactory
import team.me.common.annotations.hexagonal.PersistenceAdapter

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@PersistenceAdapter
class GeoPartialIndexJpaRepositoryImpl(
    private val queryFactory: JPAQueryFactory,
) : GeoPartialIndexJpaCustomRepository
