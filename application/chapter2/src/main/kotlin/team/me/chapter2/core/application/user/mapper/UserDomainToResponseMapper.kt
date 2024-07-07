package team.me.chapter2.core.application.user.mapper

import org.springframework.stereotype.Component
import team.me.chapter2.core.application.user.dto.RegisterUserDto
import team.me.chapter2.core.domain.user.entity.IUser

@Component
class UserDomainToResponseMapper {
    fun toRegisterUserResponse(user: IUser) =
        with(user) {
            RegisterUserDto.Response(
                userId = this.userId!!,
                userName = this.username!!,
                userEmail = this.userEmail!!,
                isValid = this.userIsValid,
            )
        }
}
