package com.example.testapplication
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intent_task_second.*


class IntentTaskSecond : AppCompatActivity() {
    private val KEY = "KEY"

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_task_second)

        // why i can't take data from the implicit intent
        intentResult.text = intent.extras?.getString(Intent.EXTRA_TEXT) ?: "Default text"
        buttonFirst.setOnClickListener {
            setUserResult(1)
        }
        buttonSecond.setOnClickListener {
            setUserResult(2)
        }
    }

    private fun setUserResult(index:Int) {
        setResult(RESULT_OK, Intent().apply {
            putExtra(KEY, "$index")
        })
        finish()
    }
}