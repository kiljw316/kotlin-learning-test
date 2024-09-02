package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe

class FlatMapTest : FunSpec({
    test("flatMap") {
        val fruitsBag = listOf("apple", "orange", "banana", "grapes")
        val clothesBag = listOf("shirts", "pants", "jeans")
        val cart = listOf(fruitsBag, clothesBag)
        val mapBag = cart.map { it }
        val flatMapBag = cart.flatMap { it }

        mapBag shouldBe listOf(fruitsBag, clothesBag)
        flatMapBag shouldHaveSize 7
        flatMapBag shouldBe listOf("apple", "orange", "banana", "grapes", "shirts", "pants", "jeans")
    }
})