package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val man = Person("Ivan", "Ivanov", 35);
        val politeMan = PolitePerson("Dmitriy", "Glukhovsky", 41);

        man.makeSound();
        politeMan.makeSound();

        man.eat();
        politeMan.eat();

        politeMan.talk();
    }
}