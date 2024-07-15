package uebungen.uebung_1

import uebungen.uebung_1.mediaTypes.Book

class Library(val name : String, val inventory : MutableList<Book>) {
    val availableBooks : Int?
        get() {
            if (inventory.isEmpty()) return null
            return inventory.count { it.isAvailable }
        }

    fun addBook(book : Book) {
        inventory.add(book)
    }

    private fun getAll() : List<String> {
        if (inventory.isEmpty()) {
            throw NoBooksInInventoryException("There are no books in the library")
        }
        return inventory.map { it.title }
    }

    override fun toString(): String {
        return "$name hat die folgenden Bücher: ${getAll()}"
    }
}

class NoBooksInInventoryException(message : String) : Exception(message)