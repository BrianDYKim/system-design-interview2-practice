package team.me.chapter2.core.application.user.service.user

import org.springframework.stereotype.Service
import team.me.chapter2.core.application.user.dto.RegisterUserDto
import team.me.chapter2.core.application.user.mapper.UserDomainToResponseMapper
import team.me.chapter2.core.application.user.operation.command.RegisterUserCommand
import team.me.chapter2.core.application.user.usecase.UserCommandUseCase

@Service
class UserCommandService(
    private val userCommandUseCase: UserCommandUseCase,
    private val domainToResponseMapper: UserDomainToResponseMapper,
) {
    fun registerUser(command: RegisterUserCommand): RegisterUserDto.Response? {
        val registeredUser = userCommandUseCase.registerByUser(command)

        return domainToResponseMapper.toRegisterUserResponse(registeredUser)
    }
}
