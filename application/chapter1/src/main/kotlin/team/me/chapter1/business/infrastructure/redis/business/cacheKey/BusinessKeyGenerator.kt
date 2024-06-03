package team.me.chapter1.business.infrastructure.redis.business.cacheKey

import org.springframework.stereotype.Component

@Component
class BusinessKeyGenerator {
    companion object {
        const val BUSINESS_CACHE_KEY_PREFIX = "business"
    }

    fun fromGeoHash(geoHash: String): String {
        return "$BUSINESS_CACHE_KEY_PREFIX:$geoHash"
    }
}
