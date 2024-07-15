package uebungen.uebung_3.mediaTypes

import uebungen.uebung_3.Genre

class Book (title : String,
            val author : String,
            genre: Genre,
            val pages : Int,
            isAvailable : Boolean
) : Medium(title, genre, isAvailable) {
    override fun summarize() : String {
        return "Das Buch " + super.summarize()
    }

    override fun borrowItem(): String {
        if (isAvailable) {
            return if (genre == Genre.BILDUNG) {
                super.borrowItem() + " - Ausleihfrist: 60 Tage"
            } else return super.borrowItem() + " - Ausleihfrist 30 Tage"
        }
        return super.borrowItem()
    }
}