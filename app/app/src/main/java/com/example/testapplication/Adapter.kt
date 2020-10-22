package com.example.testapplication

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    val list: List<Product>,
    var itemClick: (Int)->Unit
): RecyclerView.Adapter<Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder = Holder.create(parent,itemClick)

    override fun onBindViewHolder(holder: Holder, position: Int) = holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}