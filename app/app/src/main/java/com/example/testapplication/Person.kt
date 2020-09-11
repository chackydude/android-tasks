package com.example.testapplication

open class Person(var name: String, var soname: String, var age: Int) : Eating {
    override fun eat() {
        println("eating with using the spoon...");
    }

    open fun makeSound() {
        println("AAAAAAAAA")
    }
}