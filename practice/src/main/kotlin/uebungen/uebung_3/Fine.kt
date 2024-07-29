package uebungen.uebung_3

class Fine(val days: Int) : Iterable<Int> {
    private var current = 0
    private var next = 1
    private var currentIndex = 0

    fun getFib(): Int {
        val result = current
        val sum = current + next
        current = next
        next = sum
        currentIndex++
        return result
    }

    override fun iterator(): Iterator<Int> {
        return object : Iterator<Int> {
            override fun hasNext(): Boolean {
                return currentIndex < days
            }

            override fun next(): Int {
                if(!hasNext()) { // hier wird erstmal überprüft, ob es ein weiteres Element gibt
                    throw NoSuchElementException()
                }
                return getFib()
            }
        }
    }
}