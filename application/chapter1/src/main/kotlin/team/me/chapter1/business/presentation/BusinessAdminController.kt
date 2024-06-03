package team.me.chapter1.business.presentation

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
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
@RequestMapping("/api/v1/businesses/admin")
class BusinessAdminController(private val businessCommandService: BusinessCommandService) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    @PostMapping("/registration")
    fun register(
        @RequestBody request: RegisterBusinessDto.Request,
    ): RegisterBusinessDto.Response {
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
