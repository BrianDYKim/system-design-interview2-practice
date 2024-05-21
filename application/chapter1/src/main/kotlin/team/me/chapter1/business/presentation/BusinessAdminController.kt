package team.me.chapter1.business.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import team.me.chapter1.business.application.dto.RegisterBusiness
import team.me.chapter1.business.application.service.BusinessCommandService
import team.me.common.annotations.hexagonal.WebAdapter

/**
 * @author Doyeop Kim
 * @since 2024. 5. 16.
 */
@WebAdapter
@RequestMapping("/api/v1/admin/businesses")
class BusinessAdminController(private val businessCommandService: BusinessCommandService) {
    @PostMapping("")
    fun register(request: RegisterBusiness.Request): RegisterBusiness.Response? {
        return null
    }

    @GetMapping("")
    fun hello(): String {
        return "Hello!"
    }
}
