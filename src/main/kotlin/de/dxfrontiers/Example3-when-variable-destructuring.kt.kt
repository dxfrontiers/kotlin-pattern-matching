package de.dxfrontiers

fun withVariableDestructuring() {

    listOf("alice", "bob", "carol")
        .withIndex()
        .zip(listOf("munich", "frankfurt", "bonn"))
        .forEach { (left, city) ->
            val (index, name) = left
            println("${index}: ${name} in ${city}")
        }

}

fun withArbitraryVariableDestructuring() {

    /*

    listOf("alice", "bob", "carol")
        .withIndex()
        .zip(listOf("munich", "frankfurt", "bonn"))
        .forEach { ((index, name), city) ->
            println("${index}: ${name} in ${city}")
        }

     */
}
