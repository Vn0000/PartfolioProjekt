package com.example.partfolioprojekt.domain

import android.net.Uri
import java.io.FileDescriptor

data class PreparatItem(
    val id: Int,
    val title: String,
    val descriptor: String,
    val imageID: Uri? = null
)
