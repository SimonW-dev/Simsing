package uebungen.uebung_1

import uebungen.uebung_1.mediaTypes.*

fun main() {
    // convenience variables for readability
    val available = true
    val unavailable = false

    // Library
    val library = Library("BANGER LIBRARY", mutableListOf())
    val emptyLibrary = Library("WHACKO SHIT LIBRARY", mutableListOf())

    // Books
    val harryPotter = Book("Harry Potter", "J.K. Rowling", Genre.FANTASY, 766, available)
    val stormlightArchive = Book("Stormlight Archive", "Brandon Sanderson", Genre.FANTASY, 1258, unavailable)
    val donQuixote = Book("Don Quixote", "Miguel de Cervantes", Genre.ROMAN, 1104, available)

    // fill the library
    library.inventory.add(harryPotter)
    library.inventory.add(stormlightArchive)
    library.inventory.add(donQuixote)

    // show good library
    println(library.toString() + "\n")

    // good library summarization
    println("${library.name} summarization: ")
    library.inventory.forEach { println( it.summarize()) }

    // How many available Books are in the Library?
    println("\n Es sind ${library.availableBooks} verfügbare Bücher in ${library.name} \n")

    // make harry Potter available
    println("updating harry Potter availability...")
    harryPotter.updateAvailability()
    println(harryPotter.summarize())

    // new library functions
    val starWars = Book("Thrawns Revenge", "Timothy Zahn", Genre.SCIFI, 1000, available)
    // replaces library.inventory.add(starWars)
    library.addBook(starWars)
    println("\n" + library.toString())

    // throws noBooksInInventoryException - comment out so that the program can continue running
    // println(emptyLibrary.toString())

    // Magazine und DVDs
    val magazin = Magazine("yoooooo", 1, "stfu", Genre.BILDUNG, unavailable)
    val dvd = DVD("Ice Age", "dont remember", 230, 18, Genre.HORROR, available)
    println("\n" + magazin.subscribe("simon@kotlin.de"))
    dvd.play()
    dvd.pause()
    println(magazin.summarize())
    println(dvd.summarize())
}