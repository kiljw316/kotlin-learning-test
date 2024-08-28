fun printMessage(message: String): String {
    return message
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"): String {
    return "[$prefix] $message"
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

infix fun Int.times(str: String) = str.repeat(this)

infix fun String.onto(other: String) = Pair(this, other)

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}