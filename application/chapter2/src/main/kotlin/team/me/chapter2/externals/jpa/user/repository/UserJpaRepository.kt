package team.me.chapter2.externals.jpa.user.repository

import org.springframework.data.jpa.repository.JpaRepository
import team.me.chapter2.externals.jpa.user.entity.UserJpaEntity

interface UserJpaRepository : JpaRepository<UserJpaEntity, Long>
