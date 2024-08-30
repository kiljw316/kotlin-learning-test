import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class UserTest : FunSpec({

    test("data class automatically provided a string representation") {
        val user = User("Alex", 1)

        user.toString() shouldBe "User(name=Alex, id=1)"
    }

    test("override equals methods") {
        val user = User("Alex", 1)

        val secondUser = User("mini", 1)
        val thirdUser = User("Max", 2)

        (user == secondUser) shouldBe true
        (user == thirdUser) shouldBe false
    }

    test("data class automatically provided a hashcode method") {
        val user = User("Alex", 1)

        val secondUser = User("Alex", 1)
        val thirdUser = User("Max", 2)

        (user.hashCode() == secondUser.hashCode()) shouldBe true
        (user.hashCode() == thirdUser.hashCode()) shouldBe false
    }

    test("data class automatically provided a copy function") {
        val user = User("Alex", 1)
        val copiedUser = user.copy()

        (user == copiedUser) shouldBe true
        (user === copiedUser) shouldBe false

        user.copy("Max").toString() shouldBe "User(name=Max, id=1)"
        user.copy(id = 3).toString() shouldBe "User(name=Alex, id=3)"
    }

    test("Auto-generated componentN functions the values of properties in the order of declaration") {
        val user = User("Alex", 1)

        user.component1() shouldBe "Alex"
        user.component2() shouldBe 1
    }
})
