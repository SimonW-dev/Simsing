package uebungen.uebung_1

open class Medium(
    val title : String,
    val genre: Genre,
    var isAvailable : Boolean
) {
    open fun summarize() : String {
        val availability = when (isAvailable) {
            true -> "verfügbar"
            false -> "ausgeliehen"
        }
        return "$title aus dem Genre $genre ist $availability"
    }

    open fun updateAvailability() {
        isAvailable = !isAvailable
    }
}