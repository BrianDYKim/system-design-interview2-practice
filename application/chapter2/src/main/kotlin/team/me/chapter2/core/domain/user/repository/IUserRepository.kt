package team.me.chapter2.core.domain.user.repository

import team.me.chapter2.core.domain.user.entity.IUser

interface IUserRepository {
    fun store(user: IUser): IUser
}
