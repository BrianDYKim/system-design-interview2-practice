package team.me.chapter2.core.application.user.dto

sealed class RegisterUserDto {
    data class Request(
        val userName: String,
        val userEmail: String,
        val userPassword: String,
        val userPhoneNumber: String,
    ) : RegisterUserDto()

    data class Response(
        val userId: Long,
        val userName: String,
        val userEmail: String,
        val isValid: Boolean,
    ) : RegisterUserDto()
}
