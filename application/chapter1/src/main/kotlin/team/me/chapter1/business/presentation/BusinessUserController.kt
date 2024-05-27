package team.me.chapter1.business.presentation

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import team.me.chapter1.business.application.dto.FindNearByBusinessDto
import team.me.chapter1.business.application.operation.query.FindNearbyBusinessesQuery
import team.me.chapter1.business.application.service.BusinessQueryService

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@RestController
@RequestMapping("/api/v1/businesses")
class BusinessUserController(private val businessQueryService: BusinessQueryService) {
    fun findBusinessesByGeoHash(
        @RequestParam(value = "hash") geoHash: String,
    ): FindNearByBusinessDto.Response? {
        val findNearByBusinessesQuery = FindNearbyBusinessesQuery(geoHash)
        return null
    }
}
