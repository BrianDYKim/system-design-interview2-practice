package team.me.chapter2.core.application.user.facade

import org.springframework.stereotype.Component
import team.me.chapter2.core.domain.user.entity.IUser
import team.me.chapter2.core.domain.user.repository.IUserRepository

@Component
class UserRepositoryFacade : IUserRepository {
    override fun store(user: IUser): IUser {
        TODO("Not yet implemented")
    }
}
