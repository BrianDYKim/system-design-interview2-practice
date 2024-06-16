package team.me.chapter2.presentation.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import team.me.chapter2.core.application.user.dto.RegisterUserDto
import team.me.chapter2.core.application.user.operation.command.RegisterUserCommand
import team.me.chapter2.core.application.user.service.user.UserCommandService
import team.me.chapter2.core.application.user.service.user.UserQueryService

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userCommandService: UserCommandService,
    private val userQueryService: UserQueryService,
) {
    @PostMapping("/register")
    fun register(
        @RequestBody request: RegisterUserDto.Request,
    ): RegisterUserDto.Response? {
        val registerUserCommand =
            with(request) {
                RegisterUserCommand(
                    name = userName,
                    email = userEmail,
                    password = userPassword,
                    phoneNumber = userPhoneNumber,
                )
            }

        return null
    }
}
