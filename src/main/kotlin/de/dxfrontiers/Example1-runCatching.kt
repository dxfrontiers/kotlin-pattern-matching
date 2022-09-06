package de.dxfrontiers

import de.dxfrontiers.model.*

object Example1RunCatching {

    fun send(url: String, eventContent: EventContent): SendResult = runCatching {
        post(url, eventContent)
    }.fold(
        onSuccess = { SendSuccessful },
        onFailure = {
            when {
                it is HttpServerErrorException && it.statusCode == 500 ->
                    SendingFailed(mayResend = eventContent.allowResend)
                it is HttpClientErrorException ->
                    // log 4xx error
                    SendingFailed(mayResend = false)
                else ->
                    // log unspecific error
                    SendingFailed(mayResend = false)
            }
        }
    )

}
