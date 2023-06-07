package com.example.partfolioprojekt.presentation.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.partfolioprojekt.data.repository.PreparatListRepositoryImpl
import com.example.partfolioprojekt.databinding.ActivityEditBinding
import com.example.partfolioprojekt.domain.PreparatListRepository
import com.example.partfolioprojekt.domain.model.PreparatItem
import com.example.partfolioprojekt.domain.usecase.AddPreparatItemUseCase

class EditActivity : AppCompatActivity() {
    private val binding: ActivityEditBinding by lazy { ActivityEditBinding.inflate(layoutInflater) }
    var uriIm: Uri? = null

    private val repository: PreparatListRepository = PreparatListRepositoryImpl
    private val addPreparatItemUseCase = AddPreparatItemUseCase(preparatListRepository = repository)
    val pickMedia = registerForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
        if (uri != null) {
            binding.contentImageView.setImageURI(uri)
            uriIm = uri
            Log.d("PhotoPicker", "Selected URI: $uri")
        } else {
            Log.d("PhotoPicker", "No media selected")
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.contentImageView.setOnClickListener {
            openGallery()
        }
        binding.buttonSave.setOnClickListener {
            addPreparatItemUseCase.addPreparatItem(
                PreparatItem(
                    title = binding.contentTitle.text.toString(),
                    description = binding.descriptionText.text.toString(),
                    imageID = uriIm,
                    id = binding.contentTitle.text.toString().hashCode()
                )
            )

            finish()
        }
    }

    fun openGallery() {
        pickMedia.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
    }
}