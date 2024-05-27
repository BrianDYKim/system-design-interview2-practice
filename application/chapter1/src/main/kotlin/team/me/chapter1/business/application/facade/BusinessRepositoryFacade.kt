package team.me.chapter1.business.application.facade

import org.springframework.stereotype.Component
import team.me.chapter1.business.domain.entity.IBusiness
import team.me.chapter1.business.domain.repository.IBusinessRepository
import team.me.chapter1.business.infrastructure.jpa.business.entity.BusinessJpaEntity
import team.me.chapter1.business.infrastructure.jpa.business.entity.GeoPartialIndexJpaEntity
import team.me.chapter1.business.infrastructure.jpa.business.mapper.BusinessJpaEntityToDomainMapper
import team.me.chapter1.business.infrastructure.jpa.business.repository.BusinessJpaRepository
import team.me.chapter1.business.infrastructure.jpa.business.repository.GeoPartialIndexJpaRepository
import team.me.common.utils.geoHash.GeoHashTool

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
@Component
class BusinessRepositoryFacade(
    private val businessJpaRepository: BusinessJpaRepository,
    private val geoPartialIndexJpaRepository: GeoPartialIndexJpaRepository,
    private val jpaEntityToDomainMapper: BusinessJpaEntityToDomainMapper,
) : IBusinessRepository {
    override fun store(
        address: IBusiness.Companion.BusinessAddress,
        city: IBusiness.Companion.BusinessCity,
        state: IBusiness.Companion.BusinessState,
        country: IBusiness.Companion.BusinessCountry,
        latitude: IBusiness.Companion.BusinessLatitude,
        longitude: IBusiness.Companion.BusinessLongitude,
        geoHashPrecision: Int,
    ): IBusiness {
        val businessJpaEntity =
            BusinessJpaEntity.generate(
                address = address.value,
                city = city.value,
                state = state.value,
                country = country.value,
                latitude = latitude.value,
                longitude = longitude.value,
            )

        val storedBusinessJpaEntity = businessJpaRepository.save(businessJpaEntity)

        val geoHash = GeoHashTool.fromLatitudeAndLongitude(latitude.value, longitude.value, geoHashPrecision)

        val geoPartialIndexJpaEntity =
            GeoPartialIndexJpaEntity.generate(
                geoHash = geoHash,
                businessId = storedBusinessJpaEntity.id!!,
            )

        val storedGeoPartialIndexJpaEntity = geoPartialIndexJpaRepository.save(geoPartialIndexJpaEntity)

        return jpaEntityToDomainMapper.transform(storedBusinessJpaEntity)
    }
}
