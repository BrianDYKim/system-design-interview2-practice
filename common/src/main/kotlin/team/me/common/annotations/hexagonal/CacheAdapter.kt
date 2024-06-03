package team.me.common.annotations.hexagonal

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Repository

@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Repository
annotation class CacheAdapter(
    @get:AliasFor(annotation = Repository::class)
    val value: String = "",
)
