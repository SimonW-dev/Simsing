package uebungen.uebung_3.mediaTypes

import uebungen.uebung_3.Genre

class DVD(
    title: String,
    val director: String,
    val duration: Int,
    val usk: Int,
    genre: Genre,
    isAvailable: Boolean
) : Medium(title, genre, isAvailable) {
    override fun summarize(): String {
        return "Die DVD " + super.summarize()
    }

    fun play() = println("play")
    fun pause() = println("pause")

    override fun borrowItem(): String {
        return if (usk >= 12) {
            super.borrowItem() + " - Ein Ausweis muss vorgezeigt werden"
        } else super.borrowItem()
    }
}