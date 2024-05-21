package team.me.chapter1.business.domain.useCase

import team.me.chapter1.business.domain.entity.IBusiness
import team.me.common.annotations.hexagonal.UseCase

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@UseCase
interface BusinessSearchUseCase {
    fun findNearbyBusinessesFromGeoHash(geoHash: String): List<IBusiness>
}
