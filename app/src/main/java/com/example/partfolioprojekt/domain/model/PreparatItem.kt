package com.example.partfolioprojekt.domain.model

import android.net.Uri

data class PreparatItem(
    val title: String,
    val description: String,
    val imageID: Uri? = null,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
