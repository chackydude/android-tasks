package com.example.testapplication

import android.app.Activity
import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_DATA
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intest_task_first.*


class IntentTaskFirst : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intest_task_first)

        intentButton.setOnClickListener {
            val intent = Intent()
            val text = "Hello Intent"
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, text)
            intent.setType("text/plain")

            if (intent.resolveActivity(packageManager) != null) {
                startActivityForResult(intent, 0x9988)
            }
        }

        toActivity.setOnClickListener {
            val activityIntent = Intent(this, IntentTaskSecond::class.java)
            startActivity(activityIntent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0x9988) {
            Toast.makeText(this, "Sended", Toast.LENGTH_LONG).show();
        }
    }
}