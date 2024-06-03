package team.me.chapter1.business.infrastructure.jpa.business.repository.business

import team.me.chapter1.business.infrastructure.jpa.business.entity.BusinessJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
interface BusinessJpaCustomRepository {
    /**
     * id의 목록을 통해서 대응하는 모든 사업장 엔티티를 반환한다
     * @param idList
     * @return List<BusinessJpaEntity>
     */
    fun findByIdList(idList: List<Long>): List<BusinessJpaEntity>

    /**
     * geoHash를 통해서 대응하는 모든 사업장 엔티티를 반환한다
     * @param geoHash
     * @return List<BusinessJpaEntity>
     */
    fun findBusinessesByGeoHash(geoHash: String): List<BusinessJpaEntity>
}
