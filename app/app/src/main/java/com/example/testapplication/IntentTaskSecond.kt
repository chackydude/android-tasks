package com.example.testapplication
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intent_task_second.*


class IntentTaskSecond : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_task_second)

        // why i can't take data from the implicit intent
        val intentText = intent.getStringExtra(Intent.EXTRA_TEXT)
        intentResult.text = intentText;
    }
}