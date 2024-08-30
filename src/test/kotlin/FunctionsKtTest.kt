import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf

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

    test("Input string appears twice with infix") {
        2 times "Bye " shouldBe "Bye Bye "
    }

    test("string infix 'to' used to create pair") {
        val pair = "Ferrari" to "Katrina"

        pair.shouldBeTypeOf<Pair<String, String>>()
        pair.first shouldBe "Ferrari"
        pair.second shouldBe "Katrina"
    }

    test("string infix 'onto' used to create pair") {
        val pair = "McLaren" onto "Lucas"

        pair.shouldBeTypeOf<Pair<String, String>>()
        pair.first shouldBe "McLaren"
        pair.second shouldBe "Lucas"
    }

    test("Person infix 'likes' used to add likedPeople") {
        val sophia = Person("Sophia")
        val claudia = Person("Claudia")

        sophia likes claudia

        sophia.likedPeople.contains(claudia) shouldBe true
    }

    test("Input string appears twice with operator") {
        2 * "Bye " shouldBe "Bye Bye "
    }

    test("String get operator") {
        val str = "Always forgive your enemies; nothing annoys them so much."
        str[0..14] shouldBe "Always forgive "
    }
})
