package com.example.partfolioprojekt.domain.usecase

import com.example.partfolioprojekt.domain.model.PreparatItem
import com.example.partfolioprojekt.domain.PreparatListRepository

class GetPreparatListUseCase(private val preparatListRepository: PreparatListRepository) {
    fun getPreparatList(): List<PreparatItem> {
        return preparatListRepository.getPreparatList()
    }
}