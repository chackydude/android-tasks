package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        signInButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            if (editTextTextPersonName.text.toString() != ""
                && editTextTextPersonSoname.text.toString() != ""
                && editTextTextPersonUniversity.text.toString() != "") {
                intent.putExtra("userName", editTextTextPersonName.text.toString());
                intent.putExtra("userSoname", editTextTextPersonSoname.text.toString());
                intent.putExtra("userUniversity", editTextTextPersonUniversity.text.toString());
                startActivity(intent);
            }
        }
    }
}