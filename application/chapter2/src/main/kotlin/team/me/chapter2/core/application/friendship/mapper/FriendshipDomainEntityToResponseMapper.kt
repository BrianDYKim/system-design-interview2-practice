package team.me.chapter2.core.application.friendship.mapper

import org.springframework.stereotype.Component
import team.me.chapter2.core.application.friendship.dto.RegisterFriendshipDto
import team.me.chapter2.core.domain.friendship.entity.IFriendship

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Component
class FriendshipDomainEntityToResponseMapper {
    fun transformToRegisterResponse(friendship: IFriendship): RegisterFriendshipDto.Response =
        with(friendship) {
            RegisterFriendshipDto.Response(
                from = this.from,
                to = this.to,
            )
        }
}
