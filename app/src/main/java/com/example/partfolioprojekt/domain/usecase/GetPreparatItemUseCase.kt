package com.example.partfolioprojekt.domain.usecase

import com.example.partfolioprojekt.domain.model.PreparatItem
import com.example.partfolioprojekt.domain.PreparatListRepository

class GetPreparatItemUseCase(private val preparatListRepository: PreparatListRepository) {
    fun getPreparatItem(preparatItemId: Int): PreparatItem {
        return preparatListRepository.getPreparatItem(preparatItemId)
    }
}