package com.example.upload_firebase

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.upload_firebase.databinding.EachItemBinding
import com.squareup.picasso.Picasso

class ImagesAdapter(private var mList: List<String>):  RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>(){

    inner class ImagesViewHolder(var binding: EachItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImagesAdapter.ImagesViewHolder {
        val binding = EachItemBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return ImagesViewHolder(binding)
    }

    // GERA A VISUALIZAÇÃO DOS ITENS
    override fun onBindViewHolder(holder: ImagesAdapter.ImagesViewHolder, position: Int) {
        with(holder.binding){
            with(mList[position]){
                Picasso.get().load(this).into(imageView)
            }
        }
    }

    // CONTAGEM DOS ITEMS A SEREM EXIBIDOS
    override fun getItemCount(): Int {
        return mList.size
    }
}