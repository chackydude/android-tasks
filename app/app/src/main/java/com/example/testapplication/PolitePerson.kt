package com.example.testapplication

class PolitePerson(name: String, soname: String, age: Int) : Person(name, soname, age), Talking {
    override fun makeSound() {
        println("Hello, my name is $name");
    }

    override fun eat() {
        println("Thank u, that's very tasty")
    }

    override fun talk() {
        println("Let's talk a little")
    }
}