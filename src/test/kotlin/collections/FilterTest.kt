package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.ints.shouldBeLessThan

class FilterTest : FunSpec({
    test("filtered numbers") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val positives = numbers.filter { x -> x > 0 }
        val negatives = numbers.filter { it < 0 }

        positives.forEach {
            it shouldBeGreaterThan 0
        }

        negatives.forEach {
            it shouldBeLessThan 0
        }
    }
})