fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun test(operation: (Int, Int) -> Int): Int {
    return operation(4, 5)
}

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x