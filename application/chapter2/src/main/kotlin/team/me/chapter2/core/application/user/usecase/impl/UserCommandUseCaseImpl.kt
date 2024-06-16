package team.me.chapter2.core.application.user.usecase.impl

import team.me.chapter2.core.domain.user.repository.IUserRepository
import team.me.common.annotations.hexagonal.UseCase

@UseCase
class UserCommandUseCaseImpl(
    private val userRepository: IUserRepository,
)
