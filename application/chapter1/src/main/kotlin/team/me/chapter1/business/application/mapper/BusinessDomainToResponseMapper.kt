package team.me.chapter1.business.application.mapper

import org.springframework.stereotype.Component
import team.me.chapter1.business.application.dto.FindNearByBusinessDto
import team.me.chapter1.business.application.dto.RegisterBusinessDto
import team.me.chapter1.business.domain.entity.IBusiness

/**
 * IBusiness -> Response Dto로 변환하는 mapper
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@Component
class BusinessDomainToResponseMapper {
    /**
     * 어드민에서 사업장 등록에 대한 반환 타입을 정의
     */
    fun toRegisterResponse(business: IBusiness): RegisterBusinessDto.Response =
        with(business) {
            RegisterBusinessDto.Response(
                id = this.businessId!!,
                streetAddress = this.address.streetAddress,
                city = this.address.city,
                state = this.address.state,
                country = this.address.country,
                latitude = this.location.latitude,
                longitude = this.location.longitude,
            )
        }

    /**
     * 유저의 사업장 검색에 대한 반환 타입을 정의
     */
    fun toFindNearByBusinessResponse(
        business: IBusiness,
        geoHash: String,
    ): FindNearByBusinessDto.Response =
        with(business) {
            FindNearByBusinessDto.Response(
                id = this.businessId!!,
                streetAddress = this.address.streetAddress,
                city = this.address.city,
                state = this.address.state,
                country = this.address.country,
                latitude = this.location.latitude,
                longitude = this.location.longitude,
                geoHash = geoHash,
            )
        }
}
