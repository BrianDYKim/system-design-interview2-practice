package team.me.chapter1.business.application.useCase

import team.me.chapter1.business.application.operation.query.FindNearbyBusinessesQuery
import team.me.chapter1.business.domain.entity.IBusiness

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface BusinessSearchUseCase {
    fun findNearbyBusinessesFromGeoHash(query: FindNearbyBusinessesQuery): List<IBusiness>
}
