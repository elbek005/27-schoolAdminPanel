package com.example.teacher

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teacher.databinding.RewTableClassBinding

class ClassAdapter  (private var mList: List<ClassData>, private val c: Context) :
    RecyclerView.Adapter<ClassAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder(var binding: RewTableClassBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}