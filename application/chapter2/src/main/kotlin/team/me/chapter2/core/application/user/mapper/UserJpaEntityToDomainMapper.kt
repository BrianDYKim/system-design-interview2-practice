package team.me.chapter2.core.application.user.mapper

import org.springframework.stereotype.Component
import team.me.chapter2.core.domain.user.entity.IUser
import team.me.chapter2.externals.jpa.user.entity.UserJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Component
class UserJpaEntityToDomainMapper {
    fun transform(userJpaEntity: UserJpaEntity): IUser =
        with(userJpaEntity) {
            IUser.generate(
                userId = IUser.Companion.UserId(this.id),
                username = IUser.Companion.UserName(this.name),
                userEmail = IUser.Companion.UserEmail(this.email),
                userPassword = IUser.Companion.UserPassword(this.password),
                userPhoneNumber = IUser.Companion.UserPhone(this.phoneNumber),
                userIsValid = IUser.Companion.UserIsValid(this.isValid),
            )
        }
}
