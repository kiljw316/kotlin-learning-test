package scopeFunctions

fun main() {
    val jake = Person()
    println(jake)
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)
    println(jake)
}