package de.dxfrontiers

import de.dxfrontiers.WeekDay.*

enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun whenWithIntConstants(x: Int) {

    when (x) {
        42 -> println("The answer!")
        1337 -> println("leet")
        else -> println("anything else")
    }

}

fun whenWithEnums(x: WeekDay) {

    when (x) {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> println("tired")
        SATURDAY, SUNDAY -> println("less tired")
    }

}
