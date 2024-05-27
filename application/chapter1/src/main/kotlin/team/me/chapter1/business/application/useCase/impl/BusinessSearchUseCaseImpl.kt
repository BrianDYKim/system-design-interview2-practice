package team.me.chapter1.business.application.useCase.impl

import team.me.chapter1.business.application.operation.query.FindNearbyBusinessesQuery
import team.me.chapter1.business.application.useCase.BusinessSearchUseCase
import team.me.chapter1.business.domain.entity.IBusiness
import team.me.chapter1.business.domain.repository.IBusinessRepository
import team.me.common.annotations.hexagonal.UseCase

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@UseCase
class BusinessSearchUseCaseImpl(
    private val businessRepository: IBusinessRepository,
) : BusinessSearchUseCase {
    override fun findNearbyBusinessesFromGeoHash(query: FindNearbyBusinessesQuery): List<IBusiness> {
        TODO("Not yet implemented")
    }
}
