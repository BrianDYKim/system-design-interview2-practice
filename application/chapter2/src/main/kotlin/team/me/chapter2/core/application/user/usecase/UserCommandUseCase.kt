package team.me.chapter2.core.application.user.usecase

import team.me.chapter2.core.application.user.dto.RegisterUserDto
import team.me.chapter2.core.application.user.operation.command.RegisterUserCommand

interface UserCommandUseCase {
    fun registerByUser(command: RegisterUserCommand): RegisterUserDto.Response
}
