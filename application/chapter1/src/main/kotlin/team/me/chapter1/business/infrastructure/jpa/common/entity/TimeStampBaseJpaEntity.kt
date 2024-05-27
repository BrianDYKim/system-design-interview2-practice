package team.me.chapter1.business.infrastructure.jpa.common.entity

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class TimeStampBaseJpaEntity(
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    open var createdAt: LocalDateTime = LocalDateTime.now(),
    @LastModifiedDate
    @Column(name = "updated_at", nullable = true)
    open var updatedAt: LocalDateTime? = null,
    @Column(name = "deleted_at", nullable = true)
    open var deletedAt: LocalDateTime? = null,
) : BaseJpaEntity() {
    constructor() : this(LocalDateTime.now(), null, null)
}
