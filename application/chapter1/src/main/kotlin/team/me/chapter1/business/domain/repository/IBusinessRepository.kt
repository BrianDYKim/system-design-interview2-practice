package team.me.chapter1.business.domain.repository

import team.me.chapter1.business.domain.entity.IBusiness

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface IBusinessRepository {
    /**
     * 사업장을 등록하는 도메인 레포지토리 메소드
     * @param address
     * @param city
     * @param state
     * @param country
     * @param latitude
     * @param longitude
     * @return IBusiness
     */
    fun store(
        address: IBusiness.Companion.BusinessAddress,
        city: IBusiness.Companion.BusinessCity,
        state: IBusiness.Companion.BusinessState,
        country: IBusiness.Companion.BusinessCountry,
        latitude: IBusiness.Companion.BusinessLatitude,
        longitude: IBusiness.Companion.BusinessLongitude,
    ): IBusiness
}
