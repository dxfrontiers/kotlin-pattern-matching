package de.dxfrontiers

import de.dxfrontiers.model.*

sealed class Try<out A> {
    companion object {
        operator fun <A> invoke(f: () -> A): Try<A> =
            try { Success(f()) } catch (e: Throwable) { Failure(e) }
    }
}
data class Success<out A>(val value: A) : Try<A>()
data class Failure<out A>(val ex: Throwable) : Try<A>()

object Example1PatternMatching {

    /*

    fun send(url: String, eventContent: EventContent): SendResult =
        when (Try { post(url, eventContent) }) {
            is Success(_) ->
                SendSuccessful
            is Failure(ex: HttpServerErrorException) if ex.statusCode == 500 ->
                SendingFailed(mayResend = eventContent.allowResend)
            is Failure(_: HttpClientErrorException) ->
                // log 4xx error
                SendingFailed(mayResend = false)
            is Failure(other) ->
                // log unspecific error
                SendingFailed(mayResend = false)
        }

     */
}
