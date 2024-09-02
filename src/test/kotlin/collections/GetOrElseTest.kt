package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class GetOrElseTest : FunSpec({
    test("getOrElse of list") {
        val list = listOf(0, 10, 20)

        val value1 = list.getOrElse(1) { 42 }
        val value2 = list.getOrElse(10) { 42 }


        value1 shouldBe 10
        value2 shouldBe 42
    }

    test("getOrElse of map") {
        val map = mutableMapOf<String, Int?>()
        map.getOrElse("x") { 1 } shouldBe 1

        map["x"] = 3
        map.getOrElse("x") { 1 } shouldBe 3

        map["x"] = null
        map.getOrElse("x") { 1 } shouldBe 1
    }
})