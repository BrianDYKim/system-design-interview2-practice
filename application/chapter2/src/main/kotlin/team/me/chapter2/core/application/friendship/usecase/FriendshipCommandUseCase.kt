package team.me.chapter2.core.application.friendship.usecase

import team.me.chapter2.core.application.friendship.operation.command.RegisterFriendshipCommand
import team.me.chapter2.core.domain.friendship.entity.IFriendship

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
interface FriendshipCommandUseCase {
    fun register(command: RegisterFriendshipCommand): IFriendship
}
