package team.me.chapter2.core.application.friendship.usecase

import team.me.chapter2.core.application.friendship.operation.command.RegisterFriendshipCommand

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
interface FindUserUseCase {
    fun ensureUsersAllExists(command: RegisterFriendshipCommand): Boolean
}
