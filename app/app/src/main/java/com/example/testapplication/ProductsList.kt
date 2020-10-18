package com.example.testapplication

class ProductsList {
    val items : List<Product> = listOf(
        Product(0,"Bread", R.drawable.bread, "Food made of flour, water, and yeast or another leavening agent, mixed together and baked."),
        Product(1,"Eggs", R.drawable.eggs, "An oval or round object laid by a female bird, reptile, fish, or invertebrate."),
        Product(2,"Porridge", R.drawable.porridge, "A dish consisting of oatmeal or another meal or cereal boiled in water or milk.")
    )

    fun getProductById(id: Int): Product {
        return this.items[id]
    }
}