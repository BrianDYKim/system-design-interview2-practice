package team.me.chapter1.business.presentation

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import team.me.chapter1.business.application.dto.RegisterBusinessDto
import team.me.chapter1.business.application.operation.command.RegisterBusinessCommand
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
    fun register(request: RegisterBusinessDto.Request): RegisterBusinessDto.Response? {
        val registerCommand =
            with(request) {
                RegisterBusinessCommand(
                    streetAddress = this.streetAddress,
                    city = this.city,
                    state = this.state,
                    country = this.country,
                    latitude = this.latitude,
                    longitude = this.longitude,
                )
            }

        return businessCommandService.register(registerCommand)
    }
}
