package com.example.partfolioprojekt.domain

class DeletePreparatItemUseCase (private val preparatListRepository: PreparatListRepository) {
    fun deletePreparatItem(preparatItem: PreparatItem){
        preparatListRepository.deletePreparatItem(preparatItem)
    }
}