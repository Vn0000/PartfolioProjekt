package com.example.partfolioprojekt.domain.usecase

import com.example.partfolioprojekt.domain.model.PreparatItem
import com.example.partfolioprojekt.domain.PreparatListRepository

class DeletePreparatItemUseCase (private val preparatListRepository: PreparatListRepository) {
    fun deletePreparatItem(preparatItem: PreparatItem){
        preparatListRepository.deletePreparatItem(preparatItem)
    }
}