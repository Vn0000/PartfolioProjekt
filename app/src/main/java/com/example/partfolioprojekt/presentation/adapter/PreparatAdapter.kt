package com.example.partfolioprojekt

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnLongClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.partfolioprojekt.databinding.PreparatItemBinding
import com.example.partfolioprojekt.domain.model.PreparatItem

class PreparatAdapter(
    val onPreparatLongClickListener: (Int) -> Unit,
    val onPreparatClickListener: (Int) -> Unit
) : RecyclerView.Adapter<PreparatAdapter.PreparatHolder>() {
    val preparatList = ArrayList<PreparatItem>()

    inner class PreparatHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = PreparatItemBinding.bind(item)
        fun bind(preparat: PreparatItem) = with(binding) {
            im.setImageURI(preparat.imageID)
            tvTitle.text = preparat.title
            root.setOnClickListener {
                onPreparatClickListener(preparat.id)
            }
            root.setOnLongClickListener {
                TODO()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreparatHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.preparat_item, parent, false)
        return PreparatHolder(view)
    }

    override fun onBindViewHolder(holder: PreparatHolder, position: Int) {
        holder.bind(preparatList[position])
    }

    override fun getItemCount(): Int {
        return preparatList.size
    }

}