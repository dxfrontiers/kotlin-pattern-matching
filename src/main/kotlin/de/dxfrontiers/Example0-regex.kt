package de.dxfrontiers

fun regex(x: String) {

    val pattern = """Map<([^,]+),([^,]+)>${'$'}""".toRegex()

    pattern
        .find(x)
        ?.run {
            val (leftType, rightType) = this.destructured

            println("Map<${leftType}, ${rightType}>")
        }

}
