package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PartitionTest : FunSpec({
    test("partition") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val evenOdd = numbers.partition { it % 2 == 0 }
        val (positives, negatives) = numbers.partition { it > 0 }

        evenOdd.first shouldBe listOf(-2, -4, -6)
        evenOdd.second shouldBe listOf(1, 3, 5)
        positives shouldBe listOf(1, 3, 5)
        negatives shouldBe listOf(-2, -4, -6)
    }
})