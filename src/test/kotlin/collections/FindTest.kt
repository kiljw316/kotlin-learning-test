package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FindTest : FunSpec({
    test("find and findLast") {
        val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

        val first = words.find { it.startsWith("some") }
        val last = words.findLast { it.startsWith("some") }
        val nothing = words.find { it.contains("nothing") }

        first shouldBe "something"
        last shouldBe "somehow"
        nothing shouldBe null
    }
})