package team.me.chapter1.business.infrastructure.jpa.common.entity

import jakarta.persistence.MappedSuperclass

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
@MappedSuperclass
abstract class NonTimeStampBaseJpaEntity : BaseJpaEntity()
