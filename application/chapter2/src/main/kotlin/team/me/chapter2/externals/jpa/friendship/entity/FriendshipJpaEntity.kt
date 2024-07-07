package team.me.chapter2.externals.jpa.friendship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import team.me.chapter2.externals.jpa.common.entity.TimeStampBaseJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Entity
@Table(name = "chapter2_friendships")
open class FriendshipJpaEntity protected constructor() : TimeStampBaseJpaEntity() {
    companion object {
        fun generate(
            id: Long?,
            from: Long,
            to: Long,
        ) = FriendshipJpaEntity()
            .apply {
                this.id = id
                this.from = from
                this.to = to
            }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = 0L

    @Column(name = "from_user_id", nullable = false)
    open var from: Long = 0L

    @Column(name = "to_user_id", nullable = false)
    open var to: Long = 0L

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (javaClass != other?.javaClass) return false

        val that = other as FriendshipJpaEntity

        return this.id == that.id
    }

    override fun hashCode(): Int = this.id?.hashCode() ?: 0
}
