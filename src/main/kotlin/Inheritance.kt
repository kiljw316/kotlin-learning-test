open class Dog {
    open fun sayHello(): String {
        return "wow wow!"
    }
}

class Yorkshire : Dog() {
    override fun sayHello(): String {
        return "wif wif!"
    }
}

open class Tiger(val origin: String) {
    fun sayHello(): String {
        return "A tiger from $origin says: grrhhh!"
    }
}

class SiberianTiger: Tiger("Siberia")

open class Lion(val name: String, val origin: String) {
    fun sayHello(): String {
        return "$name, the lion from $origin says: graoh!"
    }
}

class Asiatic(name: String): Lion(name = name, origin = "India")