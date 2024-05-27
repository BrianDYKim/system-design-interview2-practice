package team.me.chapter1.business.infrastructure.jpa.business.repository.geoPartial

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
interface GeoPartialIndexJpaCustomRepository {
    /**
     * geohash에 대응하는 모든 사업장 jpa 엔티티들의 id 목록을 반환한다
     */
    fun findBusinessIdListByGeoHash(geoHash: String): List<Long>
}
