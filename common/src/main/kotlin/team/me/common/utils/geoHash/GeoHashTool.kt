package team.me.common.utils.geoHash

import ch.hsr.geohash.GeoHash

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
object GeoHashTool {
    fun fromLatitudeAndLongitude(
        latitude: Double,
        longitude: Double,
        precision: Int,
    ): String {
        val geoHash = GeoHash.withCharacterPrecision(latitude, longitude, precision)

        return geoHash.toBase32()
    }
}
