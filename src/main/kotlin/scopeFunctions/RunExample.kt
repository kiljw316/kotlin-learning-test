package scopeFunctions

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")

        }
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}