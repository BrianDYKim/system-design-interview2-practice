package team.me.chapter1.business.infrastructure.jpa.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@Entity
@Table(name = "businesses")
open class BusinessJpaEntity protected constructor() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id", nullable = false)
    var id: Long = 0L

    @get:Column(name = "address", nullable = false)
    var address: String = ""

    @get:Column(name = "city", nullable = false)
    var city: String = ""

    @get:Column(name = "state", nullable = false)
    var state: String = ""

    @get:Column(name = "country", nullable = false)
    var country: String = ""

    @get:Column(name = "latitude", nullable = false)
    var latitude: Double = 0.0

    @get:Column(name = "longitude", nullable = false)
    var longitude: Double = 0.0

    @get:Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now()

    @get:Column(name = "updated_at", nullable = true)
    var updatedAt: LocalDateTime? = null

    @get:Column(name = "deleted_at", nullable = true)
    var deletedAt: LocalDateTime? = null
}
