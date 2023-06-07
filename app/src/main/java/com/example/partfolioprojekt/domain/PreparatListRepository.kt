package com.example.partfolioprojekt.domain

import com.example.partfolioprojekt.domain.model.PreparatItem

interface PreparatListRepository {
    fun addPreparatItem(preparatItem: PreparatItem)

    fun deletePreparatItem(preparatItem: PreparatItem)

    fun editPreparatItem(preparatItem: PreparatItem)

    fun getPreparatItem(preparatItemId: Int): PreparatItem

    fun getPreparatList(): List<PreparatItem>

}