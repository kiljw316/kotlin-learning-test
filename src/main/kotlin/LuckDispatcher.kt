import java.util.*

class LuckDispatcher {
    fun getNumber(): Int {
        val objRandom = Random()
        return objRandom.nextInt(90)
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Int {

    val datRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = datRates.standard + datRates.festivity + datRates.special

    return total
}

object DoAuth {
    fun takeParams(username: String, password: String): String {
        return "input Auth parameters = $username:$password"
    }
}

class BigBen {
    companion object {
        fun getBongs(nTimes: Int): String {
            var result = ""
            for (i in 1..nTimes) {
                result += "BONG "
            }

            return result
        }
    }
}