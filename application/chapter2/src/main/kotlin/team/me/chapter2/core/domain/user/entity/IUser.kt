package team.me.chapter2.core.domain.user.entity

class IUser private constructor(
    val userId: Long?,
    var username: String?,
    var userEmail: String?,
    var userPassword: String?,
    var userPhoneNumber: String?,
    var userIsValid: Boolean,
) {
    companion object {
        fun generate(
            userId: UserId,
            username: UserName,
            userEmail: UserEmail,
            userPassword: UserPassword,
            userPhoneNumber: UserPhone,
            userIsValid: UserIsValid,
        ): IUser {
            return IUser(
                userId = userId.value,
                username = username.value,
                userEmail = userEmail.value,
                userPassword = userPassword.value,
                userPhoneNumber = userPhoneNumber.value,
                userIsValid = userIsValid.value,
            )
        }

        @JvmInline
        value class UserId(val value: Long?)

        @JvmInline
        value class UserName(val value: String?)

        @JvmInline
        value class UserEmail(val value: String?)

        @JvmInline
        value class UserPassword(val value: String?)

        @JvmInline
        value class UserPhone(val value: String?)

        @JvmInline
        value class UserIsValid(val value: Boolean = false)
    }

    // 유저의 휴대폰번호를 갱신한다
    fun updatePhoneNumber(phoneNumber: UserPhone): IUser {
        return this.apply {
            userPhoneNumber = phoneNumber.value
        }
    }
}
