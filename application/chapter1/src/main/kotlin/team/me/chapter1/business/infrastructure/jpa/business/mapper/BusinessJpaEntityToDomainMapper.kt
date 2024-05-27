package team.me.chapter1.business.infrastructure.jpa.business.mapper

import org.springframework.stereotype.Component
import team.me.chapter1.business.domain.entity.IBusiness
import team.me.chapter1.business.infrastructure.jpa.business.entity.BusinessJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@Component
class BusinessJpaEntityToDomainMapper {
    fun transform(businessJpaEntity: BusinessJpaEntity): IBusiness {
        return IBusiness.generate(
            id = IBusiness.Companion.BusinessId(businessJpaEntity.id),
            address = IBusiness.Companion.BusinessAddress(businessJpaEntity.address),
            city = IBusiness.Companion.BusinessCity(businessJpaEntity.city),
            state = IBusiness.Companion.BusinessState(businessJpaEntity.state),
            country = IBusiness.Companion.BusinessCountry(businessJpaEntity.country),
            latitude = IBusiness.Companion.BusinessLatitude(businessJpaEntity.latitude),
            longitude = IBusiness.Companion.BusinessLongitude(businessJpaEntity.longitude),
        )
    }
}
