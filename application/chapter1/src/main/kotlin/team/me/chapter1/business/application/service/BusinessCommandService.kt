package team.me.chapter1.business.application.service

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import team.me.chapter1.business.application.dto.RegisterBusinessDto
import team.me.chapter1.business.application.mapper.BusinessDomainToResponseMapper
import team.me.chapter1.business.application.operation.command.RegisterBusinessCommand
import team.me.chapter1.business.application.useCase.BusinessAdministrationUseCase

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@Service
class BusinessCommandService(
    private val businessAdministrationUseCase: BusinessAdministrationUseCase,
    private val domainToResponseMapper: BusinessDomainToResponseMapper,
) {
    /**
     * @param command 사업장의 등록 요청 커맨드
     * @return RegisterBusinessDto.Response
     */
    @Transactional
    fun register(command: RegisterBusinessCommand): RegisterBusinessDto.Response {
        val registeredBusiness = businessAdministrationUseCase.register(command)

        return domainToResponseMapper.toRegisterResponse(registeredBusiness)
    }
}
