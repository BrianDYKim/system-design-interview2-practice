package team.me.chapter2.core.application.user.facade

import org.springframework.stereotype.Component
import team.me.chapter2.core.domain.user.entity.IUser
import team.me.chapter2.core.domain.user.repository.IUserRepository

@Component
class UserRepositoryFacade : IUserRepository {
    override fun store(
        userId: IUser.Companion.UserId,
        userName: IUser.Companion.UserName,
        userEmail: IUser.Companion.UserEmail,
        userPassword: IUser.Companion.UserPassword,
        phoneNumber: IUser.Companion.UserPhone,
        isValid: IUser.Companion.UserIsValid,
    ): IUser {
        TODO("Not yet implemented")
    }
}
