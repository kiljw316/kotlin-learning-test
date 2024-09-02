package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.math.abs

class SortedTest : FunSpec({
    test("sorted natural sort order (ascending).") {
        val shuffled = listOf(5, 4, 2, 1, 3, -10)
        val natural = shuffled.sorted()
        val descending = shuffled.sortedDescending()

        natural shouldBe listOf(-10, 1, 2, 3, 4, 5)
        descending shouldBe listOf(5, 4, 3, 2, 1, -10)
    }

    test("sortedBy") {
        val shuffled = listOf(5, 4, 2, 1, 3, -10)
        val inverted = shuffled.sortedBy { -it }
        val descendingBy = shuffled.sortedByDescending { abs(it) }

        inverted shouldBe listOf(5, 4, 3, 2, 1, -10)
        descendingBy shouldBe listOf(-10, 5, 4, 3, 2, 1)
    }
})