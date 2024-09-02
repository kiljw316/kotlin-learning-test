import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldHaveLength

class LambdasTest : FunSpec({

    test(" lambda test") {
        val upperCase1: (String) -> String = { str: String -> str.uppercase() }
        val upperCase2: (String) -> String = { str -> str.uppercase() }
        val upperCase3 = { str: String -> str.uppercase() }
//        val upperCase4 = { str -> str.uppercase() }
        val upperCase5: (String) -> String = { it.uppercase() }
        val upperCase6: (String) -> String = String::uppercase

        upperCase1("hello") shouldBe "HELLO"
        upperCase2("hello") shouldBe "HELLO"
        upperCase3("hello") shouldBe "HELLO"
//        upperCase4("hello") shouldBe "HELLO"
        upperCase5("hello") shouldBe "HELLO"
        upperCase6("hello") shouldBe "HELLO"
    }
})