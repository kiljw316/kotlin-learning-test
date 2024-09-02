package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CheckExistenceTest : FunSpec({
    test("any") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val anyNegative = numbers.any { it < 0 }
        val anyGT6 = numbers.any { it > 6 }

        anyNegative shouldBe true
        anyGT6 shouldBe false
    }

    test("all") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val allEven = numbers.all { it % 2 == 0 }
        val allLess6 = numbers.all { it < 6 }

        allEven shouldBe false
        allLess6 shouldBe true
    }

    test("none") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val allEven = numbers.none { it % 2 == 1 }
        val allLess6 = numbers.none { it > 6 }

        allEven shouldBe false
        allLess6 shouldBe true
    }
})