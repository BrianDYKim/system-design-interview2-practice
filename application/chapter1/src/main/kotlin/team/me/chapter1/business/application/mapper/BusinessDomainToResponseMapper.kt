package team.me.chapter1.business.application.mapper

import org.springframework.stereotype.Component
import team.me.chapter1.business.application.dto.RegisterBusinessDto
import team.me.chapter1.business.domain.entity.IBusiness

/**
 * IBusiness -> Response Dto로 변환하는 mapper
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@Component
class BusinessDomainToResponseMapper {
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
}
