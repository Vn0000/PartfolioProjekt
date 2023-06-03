package com.example.partfolioprojekt.domain

class GetPreparatItemUseCase(private val preparatListRepository: PreparatListRepository) {
    fun getPreparatItem(preparatItemId: Int): PreparatItem {
        return preparatListRepository.getPreparatItem(preparatItemId)
    }
}