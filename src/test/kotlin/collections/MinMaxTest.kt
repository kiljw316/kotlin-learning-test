package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MinMaxTest : FunSpec({
    test("minOrNull, maxOrNull") {
        val numbers = listOf(1, 2, 3)
        val empty = emptyList<Int>()
        val only = listOf(3)

        numbers.minOrNull() shouldBe 1
        numbers.maxOrNull() shouldBe 3
        empty.minOrNull() shouldBe null
        empty.maxOrNull() shouldBe null
        only.minOrNull() shouldBe 3
        only.maxOrNull() shouldBe 3

    }
})