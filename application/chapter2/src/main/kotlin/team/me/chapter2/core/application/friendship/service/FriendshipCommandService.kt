package team.me.chapter2.core.application.friendship.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import team.me.chapter2.core.application.friendship.dto.RegisterFriendshipDto
import team.me.chapter2.core.application.friendship.mapper.FriendshipDomainEntityToResponseMapper
import team.me.chapter2.core.application.friendship.operation.command.RegisterFriendshipCommand
import team.me.chapter2.core.application.friendship.usecase.FriendshipCommandUseCase
import team.me.chapter2.core.application.friendship.validator.FriendshipCommandServiceValidator

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Service
class FriendshipCommandService(
    private val friendshipCommandServiceValidator: FriendshipCommandServiceValidator,
    private val friendshipCommandUseCase: FriendshipCommandUseCase,
    private val domainToResponseMapper: FriendshipDomainEntityToResponseMapper,
) {
    @Transactional(readOnly = false)
    fun register(command: RegisterFriendshipCommand): RegisterFriendshipDto.Response {
        friendshipCommandServiceValidator.validateRegisterCommand(command)

        val registeredFriendship = friendshipCommandUseCase.register(command)

        return domainToResponseMapper.transformToRegisterResponse(registeredFriendship)
    }
}
