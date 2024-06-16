package team.me.chapter2.core.application.user.service.user

import org.springframework.stereotype.Service
import team.me.chapter2.core.application.user.dto.RegisterUserDto
import team.me.chapter2.core.application.user.operation.command.RegisterUserCommand

@Service
class UserCommandService {
    fun registerUser(command: RegisterUserCommand): RegisterUserDto.Response? {
        return null
    }
}
