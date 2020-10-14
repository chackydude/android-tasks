package com.example.testapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_frame_test.*


class FrameTest : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_test)
        val colors: Array<Int> = arrayOf(R.color.colorPrimary, R.color.colorAccent, R.color.anotherColor1, R.color.anotherColor2, R.color.anotherColor3)
        val imageViews: Array<View> = arrayOf(imageView1, imageView2, imageView3, imageView4, imageView5)
        var selected = 1;
        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragmentContainer, MyFragment1().newInstance()).commit()

        imageView1.setOnClickListener{
            imageViews[selected - 1].setBackgroundColor(resources.getColor(colors[selected - 1]))
            selected = 1;
            transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, MyFragment1().newInstance()).commit()
            imageView1.setBackgroundColor(resources.getColor(R.color.colorSelected))
        }

        imageView2.setOnClickListener{
            imageViews[selected - 1].setBackgroundColor(resources.getColor(colors[selected - 1]))
            selected = 2;
            transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, MyFragment2().newInstance()).commit()
            imageView2.setBackgroundColor(resources.getColor(R.color.colorSelected))
        }

        imageView3.setOnClickListener{
            imageViews[selected - 1].setBackgroundColor(resources.getColor(colors[selected - 1]))
            selected = 3;
            transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, MyFragment3().newInstance()).commit()
            imageView3.setBackgroundColor(resources.getColor(R.color.colorSelected))
        }

        imageView4.setOnClickListener{
            imageViews[selected - 1].setBackgroundColor(resources.getColor(colors[selected - 1]))
            selected = 4;
            transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, MyFragment4().newInstance()).commit()
            imageView4.setBackgroundColor(resources.getColor(R.color.colorSelected))
        }

        imageView5.setOnClickListener{
            imageViews[selected - 1].setBackgroundColor(resources.getColor(colors[selected - 1]))
            selected = 5;
            transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, MyFragment5().newInstance()).commit()
            imageView5.setBackgroundColor(resources.getColor(R.color.colorSelected))
        }
    }
}