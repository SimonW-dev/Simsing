package uebungen.uebung_3.mediaTypes

import uebungen.uebung_3.borrowHistory.BorrowInfo

interface Borrowable {
    fun borrowItem(): String
    fun returnItem(): String
}