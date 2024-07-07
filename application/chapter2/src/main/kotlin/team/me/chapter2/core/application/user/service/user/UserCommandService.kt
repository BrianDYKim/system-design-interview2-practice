package team.me.chapter2.core.application.user.service.user

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import team.me.chapter2.core.application.user.dto.RegisterUserDto
import team.me.chapter2.core.application.user.mapper.UserDomainToResponseMapper
import team.me.chapter2.core.application.user.operation.command.RegisterUserCommand
import team.me.chapter2.core.application.user.usecase.UserCommandUseCase
import team.me.chapter2.core.application.user.validator.UserServiceValidator

@Service
class UserCommandService(
    private val userCommandUseCase: UserCommandUseCase,
    private val userServiceValidator: UserServiceValidator,
    private val domainToResponseMapper: UserDomainToResponseMapper,
) {
    @Transactional(readOnly = false)
    fun registerUser(command: RegisterUserCommand): RegisterUserDto.Response {
        val registeredUser = userCommandUseCase.registerByUser(command)

        return domainToResponseMapper.toRegisterUserResponse(registeredUser)
    }
}
