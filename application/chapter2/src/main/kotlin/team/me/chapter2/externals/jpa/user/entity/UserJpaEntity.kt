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
    companion object {
        fun generate(
            id: Long?,
            name: String,
            email: String,
            password: String,
            phoneNumber: String,
            isValid: Boolean,
        ) = UserJpaEntity().apply {
            this.id = id
            this.name = name
            this.email = email
            this.password = password
            this.phoneNumber = phoneNumber
            this.isValid = isValid
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = 0L

    @Column(name = "name", nullable = false)
    open var name: String = ""

    @Column(name = "email", nullable = false)
    open var email: String = ""

    @Column(name = "password", nullable = false)
    open var password: String = ""

    @Column(name = "phone_number", nullable = false)
    open var phoneNumber: String = ""

    @Column(name = "is_valid", nullable = false)
    open var isValid: Boolean = false

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        val that = other as UserJpaEntity

        return id == that.id
    }

    override fun hashCode(): Int = id?.hashCode() ?: 0
}
