package team.me.chapter1.business.infrastructure.jpa.business.repository

import org.springframework.data.jpa.repository.JpaRepository
import team.me.chapter1.business.infrastructure.jpa.business.entity.BusinessJpaEntity
import team.me.common.annotations.hexagonal.PersistenceAdapter

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@PersistenceAdapter
interface BusinessJpaRepository : JpaRepository<BusinessJpaEntity, Long>
