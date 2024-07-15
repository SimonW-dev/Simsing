package uebungen.uebung_3.mediaTypes

import uebungen.uebung_3.Genre

class Magazine(
    title: String,
    val issueNo: Int,
    val publication: String,
    genre: Genre,
    isAvailable: Boolean
) : Medium(title, genre, isAvailable) {
    override fun summarize(): String {
        return "Das Magazin " + super.summarize()
    }

    fun subscribe(email : String) : String {
        return "$email hat $title abonniert"
    }
}