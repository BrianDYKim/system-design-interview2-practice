package team.me.chapter1.business.application.service

import org.springframework.stereotype.Service
import team.me.chapter1.business.application.operation.command.RegisterBusinessCommand
import team.me.chapter1.business.domain.entity.IBusiness
import team.me.chapter1.business.domain.useCase.BusinessAdministrationUseCase

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@Service
class BusinessCommandService : BusinessAdministrationUseCase {
    override fun register(business: RegisterBusinessCommand): IBusiness {
        TODO("Not yet implemented")
    }
}
