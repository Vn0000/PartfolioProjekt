package com.example.partfolioprojekt.domain.usecase

import com.example.partfolioprojekt.domain.model.PreparatItem
import com.example.partfolioprojekt.domain.PreparatListRepository

class AddPreparatItemUseCase(private val preparatListRepository: PreparatListRepository) {
    fun addPreparatItem(preparatItem: PreparatItem){
        preparatListRepository.addPreparatItem(preparatItem)
    }
}