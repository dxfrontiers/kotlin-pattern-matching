package de.dxfrontiers

import de.dxfrontiers.model.*

object Example1When {

    fun send(url: String, eventContent: EventContent): SendResult = try {
        post(url, eventContent)
        SendSuccessful
    } catch (ex: Exception) {
        when {
            ex is HttpServerErrorException && ex.statusCode == 500 ->
                SendingFailed(mayResend = eventContent.allowResend)
            ex is HttpClientErrorException ->
                // log 4xx error
                SendingFailed(mayResend = false)
            else ->
                // log unspecific error
                SendingFailed(mayResend = false)
        }
    }

}
