package uebungen.uebung_3.borrowHistory

import uebungen.uebung_3.mediaTypes.Medium
import java.util.*

class BorrowHistory {
    data class ListNode(val borrowInfo: BorrowInfo, var nextNode: ListNode?)

    private var first: ListNode? = null

    fun addFirst(medium: Medium) {
        val borrowInfo = BorrowInfo(Date(), medium)
        first = ListNode(borrowInfo, first)
    }

    fun clear() {
        first = null
    }

    fun getLast(): BorrowInfo? {
        var currentNode = first
        while (currentNode?.nextNode != null) {
            currentNode = currentNode.nextNode
        }
        return currentNode?.borrowInfo
    }

    fun remove(medium: Medium) {
        var currentNode: ListNode? = first
        if (currentNode?.borrowInfo?.medium  == medium) {
            first = currentNode.nextNode
        }
        while (currentNode?.nextNode != null) {
            if (currentNode.nextNode!!.borrowInfo.medium == medium) {
                currentNode.nextNode = currentNode.nextNode!!.nextNode
            }
            currentNode = currentNode.nextNode
        }
    }

    fun <R> map(transform: (BorrowInfo) -> R): List<R> {
        var currentNode = first
        val list = mutableListOf<R>()
        while (currentNode != null) {
            list.add(transform(currentNode.borrowInfo))
            currentNode = currentNode.nextNode
        }
        return list
    }

    fun filter(transform: (BorrowInfo) -> Boolean): List<BorrowInfo> {
        var currentNode = first
        val list = mutableListOf<BorrowInfo>()
        while (currentNode != null) {
            if (transform(currentNode.borrowInfo)) {
                list.add(currentNode.borrowInfo)
            }
            currentNode = currentNode.nextNode
        }
        return list
    }
}