import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ExtensionFunctionsTest : FunSpec({
    test("Extension Functions") {
        val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

        order.maxPricedItemName() shouldBe "Wine"
        order.maxPricedItemValue() shouldBe 29.0
        order.commaDelimitedItemNames shouldBe "Bread, Wine, Water"
    }

    test("Extension Functions empty item") {
        val order = Order(emptyList())

        order.maxPricedItemName() shouldBe "NO_PRODUCTS"
        order.maxPricedItemValue() shouldBe 0
        order.commaDelimitedItemNames shouldBe ""
    }

    test("null references") {
        Item("Bread", 25.0F).nullSafeToString() shouldBe "Item(name=Bread, price=25.0)"
        (null as Item?).nullSafeToString() shouldBe "NULL"
    }
})