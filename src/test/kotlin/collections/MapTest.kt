package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MapTest : FunSpec({
    test("numbers transformation") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val doubled = numbers.map { x -> x * 2 }

        val tripled = numbers.map { it * 3 }

        doubled.forEach {
            (it % 2) shouldBe 0
        }

        tripled.forEach {
            (it % 3) shouldBe 0
        }
    }
})