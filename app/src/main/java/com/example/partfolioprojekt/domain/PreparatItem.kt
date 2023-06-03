package com.example.partfolioprojekt.domain

import android.net.Uri
import java.io.FileDescriptor

data class PreparatItem(
    val title: String,
    val descriptor: String,
    val imageID: Uri? = null,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
