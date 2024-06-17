package team.me.chapter2.core.domain.user.repository

import team.me.chapter2.core.domain.user.entity.IUser

interface IUserRepository {
    fun store(
        userId: IUser.Companion.UserId,
        userName: IUser.Companion.UserName,
        userEmail: IUser.Companion.UserEmail,
        userPassword: IUser.Companion.UserPassword,
        phoneNumber: IUser.Companion.UserPhone,
        isValid: IUser.Companion.UserIsValid,
    ): IUser
}
