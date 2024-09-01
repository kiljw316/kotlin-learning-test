import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SealedTest : FunSpec({
    test("greetMammal of subclasses") {
        greetMammal(Cat("Snowy")) shouldBe "Hello Snowy"
        greetMammal(Human("Kil", "developer")) shouldBe "Hello Kil; You're working as a developer"
    }
})