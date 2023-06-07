package com.example.partfolioprojekt.data.model

import android.net.Uri
import com.example.partfolioprojekt.domain.model.PreparatItem

data class PreparatItemDto(

    val title: String,
    val description: String,
    val imageID: Uri? = null,
    var id: Int = PreparatItem.UNDEFINED_ID
)

fun PreparatItemDto.toDomain() = PreparatItem(
    title = title,
    description = description,
    imageID = imageID,
    id = id
)