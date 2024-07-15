package uebungen.uebung_3.mediaTypes

import uebungen.uebung_3.Genre
import uebungen.uebung_3.borrowHistory.BorrowInfo
import java.util.*

open class Medium(
    val title : String,
    val genre: Genre,
    var isAvailable : Boolean,
) : Borrowable {
    open fun summarize() : String {
        val availability = when (isAvailable) {
            true -> "verfügbar"
            false -> "ausgeliehen"
        }
        return "$title aus dem Genre $genre ist $availability"
    }

    override fun borrowItem(): String {
        return if (isAvailable) {
            isAvailable = false
            "$title wurde ausgeliehen"
        } else "$title ist bereits ausgeliehen"
    }

    override fun returnItem(): String {
        isAvailable = true
        return "$title wurde zurückgegeben"
    }

    override fun toString(): String {
        return title
    }
}