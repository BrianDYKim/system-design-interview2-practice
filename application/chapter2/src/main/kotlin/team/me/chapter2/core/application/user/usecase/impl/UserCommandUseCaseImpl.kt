package team.me.chapter2.core.application.user.usecase.impl

import team.me.chapter2.core.application.user.dto.RegisterUserDto
import team.me.chapter2.core.application.user.operation.command.RegisterUserCommand
import team.me.chapter2.core.application.user.usecase.UserCommandUseCase
import team.me.chapter2.core.domain.user.repository.IUserRepository
import team.me.common.annotations.hexagonal.UseCase

@UseCase
class UserCommandUseCaseImpl(
    private val userRepository: IUserRepository,
) : UserCommandUseCase {
    override fun registerByUser(command: RegisterUserCommand): RegisterUserDto.Response {
        TODO("Not yet implemented")
    }
}
