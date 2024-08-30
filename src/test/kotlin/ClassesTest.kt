import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ClassesTest : FunSpec({
    test("create instance: no header, no body class") {
        shouldNotThrow<Throwable> { Customer() }
    }

    test("create instance") {
        val contact = Contact(1, "mary@gmail.com")
        contact.id shouldBe 1
    }

    test("update instance property") {
        val contact = Contact(1, "mary@gmail.com")
        contact.email = "jane@gmail.com"

        contact.email shouldBe "jane@gmail.com"
    }
})