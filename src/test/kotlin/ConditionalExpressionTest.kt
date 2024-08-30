import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ConditionalExpressionTest : FunSpec({
    test("Instead ternary operator") {
        fun max(a: Int, b: Int) = if (a > b) a else b

        max(99, -42) shouldBe 99
    }
})