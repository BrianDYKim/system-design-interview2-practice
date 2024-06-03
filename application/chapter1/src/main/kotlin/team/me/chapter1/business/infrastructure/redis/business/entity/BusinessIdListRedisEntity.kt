package team.me.chapter1.business.infrastructure.redis.business.entity

import java.io.Serializable

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
data class BusinessIdListRedisEntity(
    val businessIdList: List<Long>,
) : Serializable
