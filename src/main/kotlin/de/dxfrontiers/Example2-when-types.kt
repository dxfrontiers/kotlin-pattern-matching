package de.dxfrontiers

sealed interface Tree<T>
data class Node<T>(val left: Tree<T>, val right: Tree<T>): Tree<T>
data class Leaf<T>(val value: T): Tree<T>

fun <T> whenWithTypes(x: Tree<T>) {

    when (x) {
        is Node -> println("Tree: ${x.left} <-> ${x.right}")
        is Leaf -> println("Leaf: ${x.value}")
    }

}
