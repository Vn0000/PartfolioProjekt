package com.example.partfolioprojekt.presentation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.partfolioprojekt.PreparatAdapter
import com.example.partfolioprojekt.data.repository.PreparatListRepositoryImpl
import com.example.partfolioprojekt.databinding.ActivityMainBinding
import com.example.partfolioprojekt.domain.PreparatListRepository
import com.example.partfolioprojekt.domain.usecase.GetPreparatListUseCase

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter =
        PreparatAdapter(
            onPreparatLongClickListener = {},
            onPreparatClickListener = { onItemClick(it) }
        )
    private val repository: PreparatListRepository = PreparatListRepositoryImpl
    private val getPreparatList = GetPreparatListUseCase(preparatListRepository = repository )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerview.adapter = adapter
        val intent = Intent(this, EditActivity::class.java)
        binding.pluscontent.setOnClickListener{
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        adapter.preparatList.clear()
        adapter.preparatList.addAll(getPreparatList.getPreparatList())
        adapter.notifyDataSetChanged()
    }

    fun onItemClick(Id: Int) {
        TODO()
    }
}