package team.me.chapter2.externals.jpa.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import team.me.chapter2.externals.jpa.common.entity.TimeStampBaseJpaEntity

@Entity
@Table(name = "chapter2_users")
open class UserJpaEntity protected constructor() : TimeStampBaseJpaEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = 0L

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        val that = other as UserJpaEntity

        if (id != that.id) return false

        return true
    }

    override fun hashCode(): Int = id?.hashCode() ?: 0
}
