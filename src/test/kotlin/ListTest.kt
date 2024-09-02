import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSize

class ListTest : FunSpec({
    test("List mutable, immutable") {
        val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
        val sudoers: List<Int> = systemUsers

        systemUsers.add(4)

        sudoers shouldHaveSize 4
    }
})