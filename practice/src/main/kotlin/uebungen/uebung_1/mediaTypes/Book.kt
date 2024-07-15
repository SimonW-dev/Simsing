package uebungen.uebung_1.mediaTypes

import uebungen.uebung_1.Genre

class Book (title : String,
            val author : String,
            genre: Genre,
            val pages : Int,
            isAvailable : Boolean
) : Medium(title, genre, isAvailable) {
    override fun summarize() : String {
        return "Das Buch " + super.summarize()
    }
}