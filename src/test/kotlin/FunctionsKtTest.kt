import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FunctionsKtTest : FunSpec({

    test("message and return value are the same") {
        printMessage(message = "Hello") shouldBe "Hello"
    }

    test("The prefix and message are combined and returned as a single string") {
        printMessageWithPrefix(message = "Hello", prefix = "Log") shouldBe "[Log] Hello"
    }

    test("message are combined default prefix Info and returned as a single string") {
        printMessageWithPrefix(message = "Hello") shouldBe "[Info] Hello"
    }

    test("sum of two int") {
        sum(1, 2) shouldBe 3
    }

    test("multiply of two int") {
        multiply(1, 2) shouldBe 2
    }
})
