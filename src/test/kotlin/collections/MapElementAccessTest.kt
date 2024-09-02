package collections

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MapElementAccessTest : FunSpec({
    test("getValue") {
        val map = mapOf("key" to 42)

        val value1 = map["key"]
        val value2 = map["key2"]

        val value3: Int = map.getValue("key")

        val mapWithDefault = map.withDefault { k -> k.length }
        val value4 = mapWithDefault.getValue("key2")

        value1 shouldBe 42
        value2 shouldBe null
        value3 shouldBe 42
        value4 shouldBe 4
        shouldThrow<NoSuchElementException> { map.getValue("anotherKey") }
    }
})