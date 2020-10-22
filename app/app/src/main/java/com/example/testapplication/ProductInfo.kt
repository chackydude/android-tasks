package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.product_info.*

class ProductInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_info)

        var id = intent.extras?.getInt("id")
        val product = id?.let { ProductsList().getProductById(it) }
        productImage.setImageResource(product?.img ?: R.drawable.ic_launcher_foreground)
        productId.text = id.toString()
        productName.text = product?.name
        productDescription.text = product?.description
    }
}