package de.dxfrontiers.model

sealed interface SendResult
object SendSuccessful: SendResult
data class SendingFailed(val mayResend: Boolean): SendResult

data class Event(
    val content: String
)

data class EventContent(
    val event: Event,
    val allowResend: Boolean
)

data class HttpServerErrorException(val statusCode: Int): RuntimeException()
data class HttpClientErrorException(val statusCode: Int): RuntimeException()

fun post(url: String, content: Any): String {
    return ""
}
