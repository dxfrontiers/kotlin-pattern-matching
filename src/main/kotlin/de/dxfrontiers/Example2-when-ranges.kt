package de.dxfrontiers

fun whenWithRanges(x: Int) {

    val range = 100..999

    when (x) {
        in 0..9 -> println("single decimal")
        in 10..99 -> println("two decimals")
        in range -> println("in specific range from ${range.first} to ${range.last}")
        else -> println("something else")
    }

}
