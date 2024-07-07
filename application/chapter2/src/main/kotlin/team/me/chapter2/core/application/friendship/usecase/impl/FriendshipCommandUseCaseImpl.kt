package team.me.chapter2.core.application.friendship.usecase.impl

import team.me.chapter2.core.application.friendship.operation.command.RegisterFriendshipCommand
import team.me.chapter2.core.application.friendship.usecase.FriendshipCommandUseCase
import team.me.chapter2.core.domain.friendship.entity.IFriendship
import team.me.chapter2.core.domain.friendship.repository.IFriendshipRepository
import team.me.common.annotations.hexagonal.UseCase

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@UseCase
class FriendshipCommandUseCaseImpl(
    private val friendshipRepository: IFriendshipRepository,
) : FriendshipCommandUseCase {
    override fun register(command: RegisterFriendshipCommand): IFriendship {
        return friendshipRepository.store(
            from = IFriendship.Companion.FromUserId(command.from),
            to = IFriendship.Companion.ToUserId(command.to),
        )
    }
}
