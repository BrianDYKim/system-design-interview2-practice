package team.me.chapter2.appConfig

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextClosedEvent
import org.springframework.stereotype.Component
import team.me.chapter2.presentation.websocket.handler.WebSocketConnectionHandler

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Component
class GracefulShutdownHandler(
    private val webSocketConnectionHandler: WebSocketConnectionHandler,
) : ApplicationListener<ContextClosedEvent> {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun onApplicationEvent(event: ContextClosedEvent) {
        logger.warn("Shutdown initialized")

        while (webSocketConnectionHandler.getActiveSessionsCount() > 0) {
            logger.info("Waiting for active sessions closed...")
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
                break
            }
        }

        logger.info("All sessions are closed. Proceeding with shutdown")
    }
}
