package team.me.chapter1.business.infrastructure.jpa.business.repository.business

import org.springframework.data.jpa.repository.JpaRepository
import team.me.chapter1.business.infrastructure.jpa.business.entity.BusinessJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface BusinessJpaRepository : JpaRepository<BusinessJpaEntity, Long>, BusinessJpaCustomRepository
