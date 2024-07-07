package team.me.chapter2.core.application.user.facade

import org.springframework.stereotype.Component
import team.me.chapter2.core.application.user.mapper.UserJpaEntityToDomainMapper
import team.me.chapter2.core.domain.user.entity.IUser
import team.me.chapter2.core.domain.user.repository.IUserRepository
import team.me.chapter2.externals.jpa.user.entity.UserJpaEntity
import team.me.chapter2.externals.jpa.user.repository.UserJpaRepository

@Component
class UserRepositoryFacade(
    private val userJpaRepository: UserJpaRepository,
    private val jpaEntityToDomainMapper: UserJpaEntityToDomainMapper,
) : IUserRepository {
    override fun store(
        username: IUser.Companion.UserName,
        email: IUser.Companion.UserEmail,
        password: IUser.Companion.UserPassword,
        phoneNumber: IUser.Companion.UserPhone,
    ): IUser {
        val userJpaEntity =
            UserJpaEntity.generate(
                id = null,
                name = username.value!!,
                email = email.value!!,
                password = password.value!!,
                phoneNumber = phoneNumber.value!!,
                isValid = true,
            )

        val storedUserJpaEntity = userJpaRepository.save(userJpaEntity)

        return jpaEntityToDomainMapper.transform(storedUserJpaEntity)
    }
}
