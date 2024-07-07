package team.me.chapter2.core.application.friendship.usecase.impl

import team.me.chapter2.core.application.friendship.operation.command.RegisterFriendshipCommand
import team.me.chapter2.core.application.friendship.usecase.FindUserUseCase
import team.me.chapter2.core.domain.user.entity.IUser
import team.me.chapter2.core.domain.user.repository.IUserRepository
import team.me.common.annotations.hexagonal.UseCase

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@UseCase
class FindUserUseCaseImpl(
    private val userRepository: IUserRepository,
) : FindUserUseCase {
    override fun ensureUsersAllExists(command: RegisterFriendshipCommand): Boolean {
        val fromUserExists = userRepository.existsById(IUser.Companion.UserId(command.from))
        val toUserExists = userRepository.existsById(IUser.Companion.UserId(command.to))

        return fromUserExists && toUserExists
    }
}
