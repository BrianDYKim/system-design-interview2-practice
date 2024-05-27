package team.me.chapter1.business.infrastructure.jpa.business.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import team.me.chapter1.business.infrastructure.jpa.common.entity.TimeStampBaseJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@Entity
@Table(name = "businesses")
open class BusinessJpaEntity protected constructor() : TimeStampBaseJpaEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id", nullable = false)
    open var id: Long? = 0L

    @get:Column(name = "address", nullable = false)
    open var address: String = ""

    @get:Column(name = "city", nullable = false)
    open var city: String = ""

    @get:Column(name = "state", nullable = false)
    open var state: String = ""

    @get:Column(name = "country", nullable = false)
    open var country: String = ""

    @get:Column(name = "latitude", nullable = false)
    open var latitude: Double = 0.0

    @get:Column(name = "longitude", nullable = false)
    open var longitude: Double = 0.0

    companion object {
        fun generate(
            address: String,
            city: String,
            state: String,
            country: String,
            latitude: Double,
            longitude: Double,
        ): BusinessJpaEntity {
            return BusinessJpaEntity().apply {
                this.address = address
                this.city = city
                this.state = state
                this.country = country
                this.latitude = latitude
                this.longitude = longitude
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        val that = other as BusinessJpaEntity

        if (id != that.id) return false

        return true
    }

    override fun hashCode(): Int = id?.hashCode() ?: 0
}
