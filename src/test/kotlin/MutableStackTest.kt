import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe

class MutableStackTest : FunSpec({
    test("create MutableStack with no arguments") {
        val mutableStack = MutableStack<Int>()

        val elements = mutableStack.elements

        elements shouldHaveSize 0
        elements shouldContainExactly listOf()
    }

    test("create MutableStack with one arguments") {
        val mutableStack = MutableStack(1)

        val elements = mutableStack.elements

        elements shouldHaveSize 1
        elements shouldContainExactly listOf(1)
    }

    test("create MutableStack with vararg arguments") {
        val mutableStack = MutableStack(1, 2, 3)

        val elements = mutableStack.elements

        elements shouldHaveSize 3
        elements shouldContainExactly listOf(1, 2, 3)
    }

    test("push") {
        val mutableStack = MutableStack(1, 2, 3)

        mutableStack.push(4)

        val elements = mutableStack.elements
        elements shouldHaveSize 4
        elements shouldContainExactly listOf(1, 2, 3, 4)
    }

    test("peak") {
        val mutableStack = MutableStack(1, 2, 3)

        val element = mutableStack.peek()

        element shouldBe 3
    }

    test("pop") {
        val mutableStack = MutableStack(1, 2, 3)

        val element = mutableStack.pop()
        val elements = mutableStack.elements

        element shouldBe 3
        elements shouldHaveSize 2
        elements shouldContainExactly listOf(1, 2)
    }

    test("isEmpty true") {
        val mutableStack = MutableStack<Int>()

        mutableStack.isEmpty() shouldBe true
    }

    test("isEmpty false") {
        val mutableStack = MutableStack(1, 2, 3)

        mutableStack.isEmpty() shouldBe false
    }

    test("size is zero") {
        val mutableStack = MutableStack<Int>()

        mutableStack.size() shouldBe 0
    }

    test("size is three") {
        val mutableStack = MutableStack(1, 2, 3)

        mutableStack.size() shouldBe 3
    }

    test("toString") {
        val mutableStack = MutableStack(1, 2, 3)

        mutableStack.toString() shouldBe "MutableStack(1, 2, 3)"
    }

    test("generic function") {
        val stack = mutableStackOf(0.62, 3.14, 2.7)

        stack.size() shouldBe 3
        stack.elements shouldContainExactly listOf(0.62, 3.14, 2.7)
    }

})
