package com.example.testapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFragment5 : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_5, container, false)
    }

    fun newInstance(): MyFragment5{
        val args = Bundle()
        val fragment = MyFragment5()
        fragment.arguments = args
        return fragment
    }
}