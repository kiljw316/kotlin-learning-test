import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class InheritanceTest : FunSpec({
    test("call of override method") {
        val dog: Dog = Yorkshire()
        val hello = dog.sayHello()

        hello shouldBe "wif wif!"
    }

    test("call with Parameterized Constructor") {
        val tiger: Tiger = SiberianTiger()

        val hello = tiger.sayHello()

        hello shouldBe "A tiger from Siberia says: grrhhh!"
    }

    test("Passing Constructor Arguments to Superclass") {
        val lion: Lion = Asiatic("Rufo")

        val hello = lion.sayHello()

        hello shouldBe "Rufo, the lion from India says: graoh!"
    }
})