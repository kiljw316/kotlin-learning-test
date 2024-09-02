package collections

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FirstLastTest : FunSpec({
    test("first, last") {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val first = numbers.first()
        val last = numbers.last()

        val firstEven = numbers.first { it % 2 == 0 }
        val lastOdd = numbers.last { it % 2 != 0 }

        first shouldBe 1
        last shouldBe -6
        firstEven shouldBe -2
        lastOdd shouldBe 5
    }

    test("first, last empty list throw NoSuchElementException") {
        val numbers = emptyList<Int>()

        shouldThrow<NoSuchElementException> { numbers.first() }
        shouldThrow<NoSuchElementException> { numbers.last() }
    }

    test("firstOrNull, lastOrNull") {
        val words = listOf("foo", "bar", "baz", "faz")
        val empty = emptyList<String>()

        val first = empty.firstOrNull()
        val last = empty.lastOrNull()

        val firstF = words.firstOrNull { it.startsWith('f') }
        val firstZ = words.firstOrNull { it.startsWith('z') }
        val lastF = words.lastOrNull { it.endsWith('f') }
        val lastZ = words.lastOrNull { it.endsWith('z') }

        first shouldBe null
        last shouldBe null

        firstF shouldBe "foo"
        firstZ shouldBe null
        lastF shouldBe null
        lastZ shouldBe "faz"
    }
})