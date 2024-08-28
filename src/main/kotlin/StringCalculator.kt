class StringCalculator {
}

fun add(numbers: String?): Int {
    if (numbers.isNullOrBlank()) {
        return 0
    }

    var parts = numbers.split(',')
    return parts
        .map { x -> x.toInt() }
        .filter { x -> x <= 1000 }
        .sum()
}