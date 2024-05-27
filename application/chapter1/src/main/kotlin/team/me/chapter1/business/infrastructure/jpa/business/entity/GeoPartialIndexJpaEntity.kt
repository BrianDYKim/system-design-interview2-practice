package team.me.chapter1.business.infrastructure.jpa.business.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import team.me.chapter1.business.infrastructure.jpa.common.entity.NonTimeStampBaseJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024. 5. 21.
 */
@Entity
@Table(name = "geopartial_indexes")
open class GeoPartialIndexJpaEntity protected constructor() : NonTimeStampBaseJpaEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id", nullable = false)
    open var id: Long? = 0L

    @get:Column(name = "geohash", nullable = false)
    open var geoHash: String = ""

    @get:Column(name = "business_id", nullable = false)
    open var businessId: Long = 0L

    companion object {
        fun generate(
            geoHash: String,
            businessId: Long,
        ): GeoPartialIndexJpaEntity {
            return GeoPartialIndexJpaEntity().apply {
                this.geoHash = geoHash
                this.businessId = businessId
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        val that = other as GeoPartialIndexJpaEntity

        if (id != that.id) return false

        return true
    }

    override fun hashCode(): Int = id?.hashCode() ?: 0
}
