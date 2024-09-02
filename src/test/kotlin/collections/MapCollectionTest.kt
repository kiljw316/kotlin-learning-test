package collections

import accountReport
import io.kotest.assertions.throwables.shouldThrowWithMessage
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import updatePointsCredit

class MapCollectionTest : FunSpec({
    test("Map mutable, immutable") {
        accountReport(1) shouldBe "ID 1: credit 100"
        updatePointsCredit(1)
        accountReport(1) shouldBe "ID 1: credit 115"
        shouldThrowWithMessage<IllegalArgumentException>("Error: Trying to update a non-existing account (id: 5)") {
            updatePointsCredit(5)
        }
    }
})