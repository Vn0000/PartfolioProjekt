package com.example.partfolioprojekt.data

import com.example.partfolioprojekt.domain.PreparatItem
import com.example.partfolioprojekt.domain.PreparatListRepository

object PreparatListRepositoryImpl : PreparatListRepository {

    private val preparatList = mutableListOf<PreparatItem>()

    private var autoIncrementId = 0


    override fun addPreparatItem(preparatItem: PreparatItem) {
        if (preparatItem.id == PreparatItem.UNDEFINED_ID) {
            preparatItem.id = autoIncrementId++
        }
        preparatList.add(preparatItem)


    }

    override fun deletePreparatItem(preparatItem: PreparatItem) {
        preparatList.remove(preparatItem)
    }

    override fun editPreparatItem(preparatItem: PreparatItem) {
        val oldElement = getPreparatItem(preparatItem.id)
        preparatList.remove(oldElement)
        addPreparatItem(preparatItem)
    }

    override fun getPreparatItem(preparatItemId: Int): PreparatItem {
        return preparatList.find { it.id == preparatItemId }
            ?: throw java.lang.RuntimeException("Element with id $preparatItemId not faund")
    }

    override fun getPreparatList(): List<PreparatItem> {
        return preparatList.toList()
    }

}