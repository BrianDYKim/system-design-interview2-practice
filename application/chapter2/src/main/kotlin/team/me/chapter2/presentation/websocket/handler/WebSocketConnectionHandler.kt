package team.me.chapter2.presentation.websocket.handler

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler
import java.util.concurrent.atomic.AtomicInteger

/**
 * @author Doyeop Kim
 * @since 2024. 7. 7.
 */
@Component
class WebSocketConnectionHandler : TextWebSocketHandler() {
    private val activeSessions = AtomicInteger(0)
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun afterConnectionEstablished(session: WebSocketSession) {
        activeSessions.incrementAndGet()
        logger.info("Connected: ${session.id}")
    }

    override fun afterConnectionClosed(
        session: WebSocketSession,
        status: CloseStatus,
    ) {
        activeSessions.decrementAndGet()
        logger.info("Disconnected: ${session.id}")
    }

    fun getActiveSessionsCount(): Int {
        return activeSessions.get()
    }
}
