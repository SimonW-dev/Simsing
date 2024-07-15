package uebungen.uebung_2

import uebungen.uebung_2.mediaTypes.*


fun main() {
    // convenience variables for readability
    val available = true
    val unavailable = false

    // Media
    val stormlightArchive = Book("Stormlight Archive", "Brandon Sanderson", Genre.FANTASY, 1258, unavailable)
    val mathe = Book("Mathe für Informatiker", "Mathelehrer", Genre.BILDUNG, 256, available)
    val magazin = Magazine("League für Dummies", 1, "04-09-2024", Genre.SCIFI, available)
    val dvd = DVD("Ice Age", "dont remember", 180, 18, Genre.HORROR, available)

    // Library
    val library = Library("BLOCKBUSTER", mutableListOf())
    library.addMedia(stormlightArchive)
    library.addMedia(mathe)
    library.addMedia(magazin)
    library.addMedia(dvd)

    // Library anzeigen
    println(library.toString())
    println()

    // Ausleihen Funktionalität
    println(stormlightArchive.borrowItem())
    println(stormlightArchive.returnItem())
    println(stormlightArchive.borrowItem())
    println(mathe.borrowItem())
    println(dvd.borrowItem())
    println()

    // Library Functions
    dvd.returnItem()
    mathe.returnItem()
    stormlightArchive.returnItem()
    println("Ausleihbare Medien: ${library.getAvailableMedia()}")
    println()
    println("Durchschnittliche Seitenzahl: ${library.calculateAveragePages()}")
}

// Die Aufgabe kann man wie im PDF geschrieben in GPT pasten und ausführliche Erklärungen bekommen
class TypenAufgabe {
    val a = Book("Harry Potter", "J.K. Rowling", Genre.FANTASY, 500, true) // OK
    // val b : Medium = Borrowable() // CF
    val c: Medium = Medium("Ein Titel", Genre.FANTASY, true) // OK
    // val d: Borrowable = c as Book // LF
    val e : Medium = a // OK
    // val f : Magazine = Medium("National Geographic", Genre.BILDUNG, true) // CF
    // val g : DVD = Medium("Inception", Genre.FANTASY, true) as DVD // LF
}
