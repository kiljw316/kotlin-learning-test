package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ZipTest : FunSpec({
    test("zip") {
        val A = listOf("a", "b", "c")
        val B = listOf(1, 2, 3, 4)

        val resultPairs = A zip B
        val resultReduce = A.zip(B) { a, b -> "$a$b" }

        resultPairs shouldBe listOf(
            "a" to 1,
            "b" to 2,
            "c" to 3
        )

        resultReduce shouldBe listOf(
            "a1",
            "b2",
            "c3"
        )
    }
})