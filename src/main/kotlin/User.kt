data class User(val name: String, val id: Int) {
    override fun equals(other: Any?): Boolean =
        other is User && other.id == this.id
}