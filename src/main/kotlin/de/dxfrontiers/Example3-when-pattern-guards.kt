package de.dxfrontiers

enum class Gender {
    MALE, FEMALE, DIVERS
}

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val gender: Gender
)

fun whenWithPatternGuards(person: Person) {

    /*

    when (person) {
        is Person where person.age >= 30 -> println("just before retirement")
        is Person where person.age < 18 -> println("the lucky ones")
        else -> println("on their peak")
    }

     */

}
