package uebungen.uebung_1.mediaTypes

import uebungen.uebung_1.Genre


class DVD(title: String,
          val director : String,
          val duration : Int,
          val usk : Int,
          genre: Genre,
          isAvailable: Boolean
) : Medium(title, genre, isAvailable) {
    override fun summarize(): String {
        return "Die DVD " + super.summarize()
    }

    fun play() = println("play")
    fun pause() = println("pause")

}