import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class HigherOrderFunctionTest : FunSpec({
    test("calculate two numbers by operation, method reference") {
        calculate(4, 5, ::sum) shouldBe 9
    }

    test("calculate two numbers by operation, lambda") {
        calculate(4, 5) { a, b -> a * b } shouldBe 20
    }

    test("returning function test") {
        val func = operation()
        func(2) shouldBe 4
    }
})