package team.me.chapter1.business.application.service

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import team.me.chapter1.business.application.dto.FindNearByBusinessDto
import team.me.chapter1.business.application.mapper.BusinessDomainToResponseMapper
import team.me.chapter1.business.application.operation.query.FindNearbyBusinessesQuery
import team.me.chapter1.business.application.useCase.BusinessSearchUseCase

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@Service
class BusinessQueryService(
    private val businessSearchUseCase: BusinessSearchUseCase,
    private val domainToResponseMapper: BusinessDomainToResponseMapper,
) {
    /**
     * 동일 geoHash에 속하는 모든 사업장을 반환한다
     * @param query
     * @return List<FindNearByBusinessDto.Response>
     */
    @Transactional
    fun findNearByBusinesses(findNearByBusinessesQuery: FindNearbyBusinessesQuery): List<FindNearByBusinessDto.Response> {
        val geoHash = findNearByBusinessesQuery.geoHash

        return businessSearchUseCase.findNearbyBusinessesFromGeoHash(findNearByBusinessesQuery)
            .map { domainToResponseMapper.toFindNearByBusinessResponse(it, geoHash) }
    }
}
