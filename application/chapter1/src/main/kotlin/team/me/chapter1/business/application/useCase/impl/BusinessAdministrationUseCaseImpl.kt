package team.me.chapter1.business.application.useCase.impl

import team.me.chapter1.business.application.operation.command.RegisterBusinessCommand
import team.me.chapter1.business.application.useCase.BusinessAdministrationUseCase
import team.me.chapter1.business.domain.entity.IBusiness
import team.me.chapter1.business.domain.repository.IBusinessRepository
import team.me.common.annotations.hexagonal.UseCase

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@UseCase
class BusinessAdministrationUseCaseImpl(
    private val businessRepository: IBusinessRepository,
) : BusinessAdministrationUseCase {
    override fun register(registerBusinessCommand: RegisterBusinessCommand): IBusiness =
        with(registerBusinessCommand) {
            return@with businessRepository.store(
                address = IBusiness.Companion.BusinessAddress(this.streetAddress),
                city = IBusiness.Companion.BusinessCity(this.city),
                state = IBusiness.Companion.BusinessState(this.state),
                country = IBusiness.Companion.BusinessCountry(this.country),
                latitude = IBusiness.Companion.BusinessLatitude(this.latitude),
                longitude = IBusiness.Companion.BusinessLongitude(this.longitude),
                geoHashPrecision = 6,
            )
        }
}
