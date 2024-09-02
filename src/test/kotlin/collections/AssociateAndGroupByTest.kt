package collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AssociateAndGroupByTest : FunSpec({
    test("AssociateBy And GroupBy") {
        val people = listOf(
            Person("John", "Boston", "+1-888-123456"),
            Person("Sarah", "Munich", "+49-777-789123"),
            Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
            Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
        )

        val phoneBook = people.associateBy { it.phone }
        val cityBook = people.associateBy(Person::phone, Person::city)
        val peopleCities = people.groupBy(Person::city, Person::name)
        val lastPersonCity = people.associateBy(Person::city, Person::name)

        phoneBook shouldBe mapOf(
            "+1-888-123456" to Person("John", "Boston", "+1-888-123456"),
            "+49-777-789123" to Person("Sarah", "Munich", "+49-777-789123"),
            "+7-999-456789" to Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
            "+7-999-123456" to Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
        )

        cityBook shouldBe mapOf(
            "+1-888-123456" to "Boston",
            "+49-777-789123" to "Munich",
            "+7-999-456789" to "Saint-Petersburg",
            "+7-999-123456" to "Saint-Petersburg"
        )

        peopleCities shouldBe mapOf(
            "Boston" to listOf("John"),
            "Munich" to listOf("Sarah"),
            "Saint-Petersburg" to listOf("Svyatoslav", "Vasilisa")
        )

        lastPersonCity shouldBe mapOf(
            "Boston" to "John",
            "Munich" to "Sarah",
            "Saint-Petersburg" to "Vasilisa"
        )
    }
})

data class Person(val name: String, val city: String, val phone: String)