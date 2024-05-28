package team.me.chapter1.business.presentation

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
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
    private val logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("")
    fun findBusinessesByGeoHash(
        @RequestParam(value = "hash") geoHash: String,
    ): List<FindNearByBusinessDto.Response> {
        val findNearByBusinessesQuery = FindNearbyBusinessesQuery(geoHash)

        return businessQueryService.findNearByBusinesses(findNearByBusinessesQuery)
    }
}
