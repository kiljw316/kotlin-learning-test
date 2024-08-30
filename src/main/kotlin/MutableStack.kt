class MutableStack<E>(vararg items: E) {
    val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)