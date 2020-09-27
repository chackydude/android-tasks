package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = getIntent().getExtras()?.getString("userName");
        val userSoname = getIntent().getExtras()?.getString("userSoname");
        val userUniversity = getIntent().getExtras()?.getString("userUniversity");

        name.text = userName;
        soname.text = userSoname;
        university.text = userUniversity;

        editButton.setOnClickListener {
            if (university.visibility == View.VISIBLE) {
                university.visibility = View.INVISIBLE
                editField.visibility = View.VISIBLE
                editButton.setText("Save information");
            } else {
                var editFieldText: String = editField.getText().toString()
                if (editFieldText == "") {
                    editFieldText = university.text.toString();
                }
                university.setText(editFieldText)
                university.visibility = View.VISIBLE
                editField.visibility = View.GONE
                editButton.setText("Edit information");
            }
        }

        button_back_registration.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}