package team.me.chapter2.presentation.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import team.me.chapter2.core.application.friendship.dto.RegisterFriendshipDto
import team.me.chapter2.core.application.friendship.operation.command.RegisterFriendshipCommand
import team.me.chapter2.core.application.friendship.service.FriendshipCommandService

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@RestController
@RequestMapping("/api/v1/friendships")
class FriendshipController(
    private val friendshipCommandService: FriendshipCommandService,
) {
    @PostMapping("")
    fun register(
        @RequestBody requestDto: RegisterFriendshipDto.Request,
    ): RegisterFriendshipDto.Response {
        val registerCommand =
            with(requestDto) {
                RegisterFriendshipCommand(from, to)
            }

        return friendshipCommandService.register(registerCommand)
    }
}
