package uebungen.uebung_3

import uebungen.uebung_3.borrowHistory.BorrowHistory
import uebungen.uebung_3.mediaTypes.*


fun main() {
    // convenience variables for readability
    val available = true
    val unavailable = false

    // Media
    val stormlightArchive = Book("Stormlight Archive", "Brandon Sanderson", Genre.FANTASY, 1258, available)
    val mathe = Book("Mathe für Informatiker", "Mathelehrer", Genre.BILDUNG, 256, available)
    val magazin = Magazine("League für Dummies", 1, "04-09-2024", Genre.SCIFI, available)
    val dvd = DVD("Ice Age", "dont remember", 180, 18, Genre.HORROR, available)

    // Library
    val library = Library("BLOCKBUSTER", mutableListOf())
    library.addMedia(stormlightArchive)
    library.addMedia(mathe)
    library.addMedia(magazin)
    library.addMedia(dvd)

    // Borrow History
    val borrowHistory = BorrowHistory()

    // Testing Borrow History
    //TODO wie kann man borrow History Einträge mit medium.borrowItem Kapseln, dass Einträge dynamisch managed werden?
    borrowHistory.addFirst(stormlightArchive)
    borrowHistory.addFirst(mathe)
    borrowHistory.addFirst(magazin)
    borrowHistory.addFirst(dvd)

    borrowHistory.map { println(it) }
    println("-----")
    println( borrowHistory.filter { it.medium.genre == Genre.BILDUNG } )


    println("-----")
    println( borrowHistory.getLast() )

    println("-----")
    borrowHistory.remove(mathe)
    borrowHistory.map { println(it) }

    println("-----")
    borrowHistory.clear()
    borrowHistory.map { println(it) }

    borrowHistory.map {  }

    // Testing Library
    library.map { println(it) }
    library.inventory.map { println(it) }

}