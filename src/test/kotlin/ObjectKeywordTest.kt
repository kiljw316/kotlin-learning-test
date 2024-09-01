import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeInRange
import io.kotest.matchers.shouldBe

class ObjectKeywordTest : FunSpec({
    test("non-deterministic test") {
        val luckDispatcher = LuckDispatcher()
        for (i in 0..1000) {
            luckDispatcher.getNumber() shouldBeInRange (0 until 90)
        }
    }

    test("object expression") {
        rentPrice(10, 2, 1) shouldBe 500
    }

    test("object Declaration and members") {
        DoAuth.takeParams("foo", "qwerty") shouldBe "input Auth parameters = foo:qwerty"
    }

    test("companion object") {
        BigBen.getBongs(12) shouldBe "BONG BONG BONG BONG BONG BONG BONG BONG BONG BONG BONG BONG "
    }
})