package team.me.chapter2.core.domain.user.entity

class IUser private constructor(
    val userId: Long?,
    val userName: String,
    val userEmail: String,
    val userPassword: String,
    val userPhoneNumber: String,
    val userIsValid: Boolean,
) {
    companion object {
        fun generate(
            userId: UserId,
            userName: UserName,
            userEmail: UserEmail,
            userPassword: UserPassword,
            userPhoneNumber: UserPhone,
            userIsValid: UserIsValid,
        ): IUser {
            return IUser(
                userId = userId.value,
                userName = userName.value,
                userEmail = userEmail.value,
                userPassword = userPassword.value,
                userPhoneNumber = userPhoneNumber.value,
                userIsValid = userIsValid.value,
            )
        }

        data class UserId(val value: Long?)

        data class UserName(val value: String)

        data class UserEmail(val value: String)

        data class UserPassword(val value: String)

        data class UserPhone(val value: String)

        data class UserIsValid(val value: Boolean)
    }
}
