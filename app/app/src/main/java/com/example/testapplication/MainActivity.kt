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

        editButton.setOnClickListener {
            if (field.visibility == View.VISIBLE) {
                field.visibility = View.INVISIBLE
                editField.visibility = View.VISIBLE
                editButton.setText("Save information");
            } else {
                var editFieldText: String = editField.getText().toString()
                if (editFieldText == "") {
                    editFieldText = "Some field text"
                }
                field.setText(editFieldText)
                field.visibility = View.VISIBLE
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