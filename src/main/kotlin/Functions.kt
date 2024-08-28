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
