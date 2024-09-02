package collections

import addIssue
import getStatusLog
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SetTest : FunSpec({
    test("Set mutable, immutable") {
        val aNewIssue = "uniqueDescr4"
        val anIssueAlreadyIn = "uniqueDescr2"

        "Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}" shouldBe "Issue uniqueDescr4 registered correctly."
        "Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}" shouldBe "Issue uniqueDescr2 marked as duplicate and rejected."
    }
})