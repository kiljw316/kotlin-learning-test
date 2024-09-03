fun findMinMax(list: List<Int>): Pair<Int, Int> {
    val intArray = list.toIntArray()
    return Pair(intArray.minOrNull() ?: 0, intArray.maxOrNull() ?: 0)
}

data class DestructuringUser(val username: String, val email: String)

fun getUser() = DestructuringUser("Mary", "mary@somewhere.com")

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

fun main() {
    val (x, y, z) = arrayOf(5, 10, 15)
    println("x: $x, y: $y, z: $z")

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))
    println("min: $min, max: $max")

    val user = getUser()
    val (username, email) = user
    println(username == user.component1())
    println(email == user.component2())

    val (_, emailAddress) = getUser()
    println("emailAddress: $emailAddress")

    val (num, name) = Pair(1, "one")

    println("num = $num, name = $name")
}