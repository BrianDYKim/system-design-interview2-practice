package team.me.chapter1.business.domain.repository

import team.me.chapter1.business.domain.entity.IBusiness

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface IBusinessRepository {
    /**
     * @param id
     * @return id를 통해 얻어온 사업장 상세 조회 결과
     */
    fun findById(id: Long): IBusiness?

    /**
     * @param business 저장할 사업장 정보
     * @return 저장된 결과
     */
    fun store(business: IBusiness): IBusiness

    /**
     * @param id 사업장 식별자
     * @param business 업데이트할 사업장 정보
     * @return 업데이트 된 결과
     */
    fun update(
        id: Long,
        business: IBusiness,
    ): IBusiness

    /**
     * @param id 삭제할 사업장 정보
     * @return 삭제된 사업장 정보
     */
    fun delete(id: Long): IBusiness

    /**
     * @param geoHash 사업장을 탐색할 geoHash 값
     * @return 해당 geoHash 내에 있는 사업장 목록
     */
    fun findBusinessesByGeoHash(geoHash: String): List<IBusiness>
}
