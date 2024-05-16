package team.me.chapter1.business.domain.useCase

import team.me.chapter1.business.domain.entity.IBusiness

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface BusinessSearchUseCase {
    fun findNearbyBusinessesFromGeoHash(geoHash: String): List<IBusiness>
}
