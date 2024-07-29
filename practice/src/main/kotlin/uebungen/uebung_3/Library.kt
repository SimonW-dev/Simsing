package uebungen.uebung_3

import uebungen.uebung_3.borrowHistory.BorrowHistory
import uebungen.uebung_3.mediaTypes.*


class Library(val name : String, val inventory : MutableList<Medium>) {
    val availableMedia : Int?
        get() {
            if (inventory.isEmpty()) return null
            return inventory.count { it.isAvailable }
        }

    fun addMedia(medium: Medium) {
        inventory.add(medium)
    }

    private fun getAll() : List<String> {
        if (inventory.isEmpty()) {
            throw NoBooksInInventoryException("Library is empty")
        }
        return inventory.map {
            when (it) {
                is Book -> "${it.title} (${it.author}) - ${it.pages} Seiten, Genre: ${it.genre}"
                is Magazine -> "${it.title} (Ausgabe: ${it.issueNo} - Veröffentlicht am ${it.publication}, Genre: ${it.genre}"
                is DVD -> "${it.title} (Regisseur: ${it.director}) - Dauer: ${it.duration} Minuten"
                else -> "${it.title} - Genre: ${it.genre}"
            }
        }
    }

    override fun toString(): String {
        return "$name hat die folgenden Medien: ${getAll()}"
    }

    fun getAvailableMedia(): List<Medium> {
        return inventory.filter { it.isAvailable }
    }

    // lässt sich wahrscheinlich auch irgendwie in einem Einzeiler implementieren
    fun calculateAveragePages(): Int {
        var numberOfBooks = 0
        var pages = 0

        inventory.forEach {
            if (it is Book) {
                pages += it.pages
                numberOfBooks++
            }
        }
        return pages / numberOfBooks
    }

    fun <R> map (transform: (Medium) -> R): List<R> {
        val list = mutableListOf<R>()
        inventory.forEach {
            list.add(transform(it))
        }

        return emptyList()
    }
}

class NoBooksInInventoryException(message : String) : Exception(message)