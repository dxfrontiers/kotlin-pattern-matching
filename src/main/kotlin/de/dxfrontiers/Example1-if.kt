package de.dxfrontiers

import de.dxfrontiers.model.*

object Example1If {

    fun send(url: String, eventContent: EventContent): SendResult = try {
        post(url, eventContent)
        SendSuccessful
    } catch (ex: HttpServerErrorException) {
        if (ex.statusCode == 500) {
            SendingFailed(mayResend = eventContent.allowResend)
        } else {
            SendingFailed(mayResend = false)
        }
    } catch (ex: Exception) {
        when (ex) {
            is HttpClientErrorException ->
                // log 4xx error
                SendingFailed(mayResend = false)
            else ->
                // log unspecific error
                SendingFailed(mayResend = false)
        }
    }

}
