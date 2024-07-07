package team.me.chapter2.core.domain.user.repository

import team.me.chapter2.core.domain.user.entity.IUser

interface IUserRepository {
    fun store(
        username: IUser.Companion.UserName,
        email: IUser.Companion.UserEmail,
        password: IUser.Companion.UserPassword,
        phoneNumber: IUser.Companion.UserPhone,
    ): IUser

    fun existsById(id: IUser.Companion.UserId): Boolean
}
