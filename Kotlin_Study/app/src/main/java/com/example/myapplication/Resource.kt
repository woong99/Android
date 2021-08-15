package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.hello)
        Log.d("mentt", "ment : " + ment)

        // 2
        val ment2 = getString(R.string.hello)
        Log.d("mentt", "ment : " + ment2)

        val color1 = getColor(R.color.textview_color)
        Log.d("mentt", "color : " + color1)

        button.setBackgroundColor(getColor(R.color.textview_color))
    }
}