import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSize

class IteratorTest : FunSpec({
    test("implemented iterator test") {
        val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

        val animalNames = mutableListOf<String>()

        for (animal in zoo) {
            animalNames.add(animal.name)
        }

        animalNames shouldHaveSize 2
    }
})