package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.product_item.*

class Holder(
    override val containerView: View,
    var itemClick: (Int)->Unit
) : RecyclerView.ViewHolder(containerView), LayoutContainer{

    fun bind(product: Product) {
        productName.text = product.name
        productImg.setImageResource(product.img)
        itemView.setOnClickListener {
            itemClick(product.id)
        }
    }

    companion object{
        fun create(parent : ViewGroup,itemClick: (Int)->Unit):Holder =
            Holder(LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent,false),itemClick)
    }
}