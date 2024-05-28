package team.me.chapter1.business.infrastructure.redis.business.repository

import org.springframework.data.redis.core.RedisTemplate
import team.me.chapter1.business.infrastructure.redis.business.cacheKey.BusinessKeyGenerator
import team.me.chapter1.business.infrastructure.redis.business.entity.BusinessIdListRedisEntity
import team.me.common.annotations.hexagonal.CacheAdapter

@CacheAdapter
class BusinessRedisRepositoryImpl(
    private val redisTemplate: RedisTemplate<String, Any>,
    private val keyGenerator: BusinessKeyGenerator,
) : BusinessRedisRepository {
    override fun saveBusinessIdListByGeoHash(
        geoHash: String,
        businessIdList: List<Long>,
    ): BusinessIdListRedisEntity {
        val cacheKey = keyGenerator.fromGeoHash(geoHash)
        val businessIdListRedisEntity = BusinessIdListRedisEntity(businessIdList)

        redisTemplate.opsForSet().add(cacheKey, businessIdListRedisEntity)

        return businessIdListRedisEntity
    }

    override fun findIdListByGeoHash(geoHash: String): BusinessIdListRedisEntity? {
        val cacheKey = keyGenerator.fromGeoHash(geoHash)

        return redisTemplate.opsForValue().get(cacheKey) as BusinessIdListRedisEntity?
    }
}
