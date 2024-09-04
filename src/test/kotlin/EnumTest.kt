import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class EnumTest : FunSpec({

    test("call enum member function") {
        val red = Color.RED

        red.containsRed() shouldBe true
        Color.BLUE.containsRed() shouldBe false
        Color.YELLOW.containsRed() shouldBe true
    }

    test("enum default toString is constant Name") {
        Color.RED.toString() shouldBe "RED"
        Color.GREEN.toString() shouldBe "GREEN"
        Color.BLUE.toString() shouldBe "BLUE"
        Color.YELLOW.toString() shouldBe "YELLOW"
    }

    test("toString call in string templates") {
        """
            ${Color.RED}
        """.trimIndent() shouldBe "RED"
    }
})