package de.dxfrontiers

fun whenWithVariableBinding(pair: Pair<Int, String>) {

    run {
        val (left, right) = Pair(42, "1337")
    }

    /*

    when (pair) {
        is Pair(val left, val right) -> println("Left Value: ${left} <-> Right Value: ${right}")
    }

     */
}
