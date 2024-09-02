const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        throw IllegalArgumentException("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountReport(accountId: Int): String {
    return "ID $accountId: credit ${EZPassReport[accountId]}"
}