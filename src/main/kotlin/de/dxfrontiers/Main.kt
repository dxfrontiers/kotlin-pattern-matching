package de.dxfrontiers

import de.dxfrontiers.model.Event
import de.dxfrontiers.model.EventContent

fun main(args: Array<String>) {
    val content = EventContent(Event("some-event"), allowResend = true)

    Example1If.send("some-url", content)
    Example1When.send("some-url", content)
    Example1RunCatching.send("some-url", content)

}
