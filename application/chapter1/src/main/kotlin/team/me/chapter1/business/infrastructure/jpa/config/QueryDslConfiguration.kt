package team.me.chapter1.business.infrastructure.jpa.config

import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Doyeop Kim
 * @since 2024. 5. 27.
 */
@Configuration
class QueryDslConfiguration(
    @PersistenceContext private val entityManager: EntityManager,
) {
    @Bean
    fun jpaQueryFactory(): JPAQueryFactory {
        return JPAQueryFactory(entityManager)
    }
}
