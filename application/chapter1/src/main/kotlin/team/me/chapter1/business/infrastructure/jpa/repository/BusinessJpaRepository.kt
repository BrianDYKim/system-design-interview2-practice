package team.me.chapter1.business.infrastructure.jpa.repository

import org.springframework.data.jpa.repository.JpaRepository
import team.me.chapter1.business.infrastructure.jpa.entity.BusinessJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface BusinessJpaRepository : JpaRepository<Long, BusinessJpaEntity>
