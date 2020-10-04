package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intest_task_first.*


class IntentTaskFirst : AppCompatActivity() {
    private val KEY = "KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intest_task_first)

        intentButton.setOnClickListener {
            val text = "Hello Intent"
            var intent = Intent(Intent.ACTION_SEND)
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            intent.putExtra(Intent.EXTRA_TEXT, text)
            if (intent.resolveActivity(packageManager) != null) {
                startActivityForResult(intent, 0x9988)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0x9988) {
            Toast.makeText(this, "User set value: ${data?.extras?.getString(KEY)}", Toast.LENGTH_LONG).show();
        }
    }
}