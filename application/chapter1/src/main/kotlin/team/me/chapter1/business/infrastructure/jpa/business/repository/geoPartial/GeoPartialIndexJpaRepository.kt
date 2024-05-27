package team.me.chapter1.business.infrastructure.jpa.business.repository.geoPartial

import org.springframework.data.jpa.repository.JpaRepository
import team.me.chapter1.business.infrastructure.jpa.business.entity.GeoPartialIndexJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
interface GeoPartialIndexJpaRepository : JpaRepository<GeoPartialIndexJpaEntity, Long>, GeoPartialIndexJpaCustomRepository
