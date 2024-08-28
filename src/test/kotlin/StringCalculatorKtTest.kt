import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class StringCalculatorKtTest : FunSpec({

    test("empty string results in zero") {
        add("") shouldBe 0
    }
})
