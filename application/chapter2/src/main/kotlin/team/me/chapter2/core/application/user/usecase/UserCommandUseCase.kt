package team.me.chapter2.core.application.user.usecase

import team.me.chapter2.core.application.user.operation.command.RegisterUserCommand
import team.me.chapter2.core.domain.user.entity.IUser

interface UserCommandUseCase {
    fun registerByUser(command: RegisterUserCommand): IUser
}
