package com.example.partfolioprojekt.domain

class AddPreparatItemUseCase(private val preparatListRepository: PreparatListRepository) {
    fun addPreparatItem(preparatItem: PreparatItem){
        preparatListRepository.addPreparatItem(preparatItem)
    }
}