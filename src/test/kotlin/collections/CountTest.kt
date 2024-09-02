package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CountTest : FunSpec({
    test("count") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val totalCount = numbers.count()
        val eventCount = numbers.count { it % 2 == 0 }

        totalCount shouldBe 6
        eventCount shouldBe 3
    }
})