package team.me.chapter1.business.domain.useCase

import team.me.chapter1.business.domain.entity.IBusiness

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
interface BusinessAdministrationUseCase {
    fun register(business: IBusiness): IBusiness

    fun update(
        id: Long,
        business: IBusiness,
    ): IBusiness

    fun delete(id: Long): IBusiness
}