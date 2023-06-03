package com.example.partfolioprojekt.domain

interface PreparatListRepository {
    fun addPreparatItem(preparatItem: PreparatItem)

    fun deletePreparatItem(preparatItem: PreparatItem)

    fun editPreparatItem(preparatItem: PreparatItem)

    fun getPreparatItem(preparatItemId: Int): PreparatItem

    fun getPreparatList(): List<PreparatItem>

}