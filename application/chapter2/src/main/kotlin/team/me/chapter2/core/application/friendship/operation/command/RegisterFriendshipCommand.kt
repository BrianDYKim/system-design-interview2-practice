package team.me.chapter2.core.application.friendship.operation.command

import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Positive
import team.me.common.validate.SelfValidating

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
data class RegisterFriendshipCommand(
    @field:NotNull
    @field:Positive
    val from: Long,
    @field:NotNull
    @field:Positive
    val to: Long,
) : SelfValidating<RegisterFriendshipCommand>() {
    init {
        validateSelf()
    }
}
