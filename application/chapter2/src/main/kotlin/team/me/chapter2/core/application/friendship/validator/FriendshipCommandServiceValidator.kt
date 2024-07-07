package team.me.chapter2.core.application.friendship.validator

import org.springframework.stereotype.Component
import team.me.chapter2.core.application.friendship.exception.NotValidFriendshipException
import team.me.chapter2.core.application.friendship.operation.command.RegisterFriendshipCommand
import team.me.chapter2.core.application.friendship.usecase.FindUserUseCase

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Component
class FriendshipCommandServiceValidator(
    private val findUserUseCase: FindUserUseCase,
) {
    fun validateRegisterCommand(command: RegisterFriendshipCommand) {
        val allUsersExists = findUserUseCase.ensureUsersAllExists(command)

        if (!allUsersExists) {
            throw NotValidFriendshipException("유저 정보가 올바르지 않습니다")
        }
    }
}
