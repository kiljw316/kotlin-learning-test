import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class EqualityTest : FunSpec({
    test("structural comparison") {
        val authors = setOf("Shakespeare", "Hemingway", "Twain")
        val writers = setOf("Twain", "Shakespeare", "Hemingway")

        (authors == writers) shouldBe true
    }

    test("referential comparison") {
        val authors = setOf("Shakespeare", "Hemingway", "Twain")
        val writers = setOf("Twain", "Shakespeare", "Hemingway")

        (authors === writers) shouldBe false
    }
})