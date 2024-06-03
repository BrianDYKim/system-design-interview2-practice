package team.me.chapter1.business.infrastructure.redis.business.repository

import team.me.chapter1.business.infrastructure.redis.business.entity.BusinessIdListRedisEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface BusinessRedisRepository {
    /**
     * geoHash에 해당하는 사업장 ID 리스트를 저장한다
     * @param geoHash
     * @param businessIdList
     * @return BusinessIdListRedisEntity
     */
    fun saveBusinessIdListByGeoHash(
        geoHash: String,
        businessIdList: List<Long>,
    ): BusinessIdListRedisEntity

    /**
     * geoHash에 해당하는 사업장 id의 목록을 cache로부터 가져온다
     * @param geoHash
     * @return BusinessIdListRedisEntity?
     */
    fun findIdListByGeoHash(geoHash: String): BusinessIdListRedisEntity?
}
