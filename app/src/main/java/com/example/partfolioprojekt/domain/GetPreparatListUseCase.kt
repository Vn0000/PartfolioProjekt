package com.example.partfolioprojekt.domain

class GetPreparatListUseCase(private val preparatListRepository: PreparatListRepository) {
    fun getPreparatList(): List<PreparatItem> {
        return preparatListRepository.getPreparatList()
    }
}