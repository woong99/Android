package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_calculator.view.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        var new="0"
        var old= "0"
        text1.setOnClickListener{
            new += "1"
            text_res.text = new
        }
        text2.setOnClickListener{
            new += "2"
            text_res.text = new
        }
        text3.setOnClickListener{
            new += "3"
            text_res.text = new
        }
        text4.setOnClickListener{
            new += "4"
            text_res.text = new
        }
        text5.setOnClickListener{
            new += "5"
            text_res.text = new

        }
        text6.setOnClickListener{
            new += "6"
            text_res.text = new

        }
        text7.setOnClickListener{
            new += "7"
            text_res.text = new
        }
        text8.setOnClickListener{
            new += "8"
            text_res.text = new
        }
        text9.setOnClickListener{
            new += "9"
            text_res.text = new
        }
        text0.setOnClickListener{
            new += "0"
            text_res.text = new
        }

        text_plus.setOnClickListener{
            old = (old.toInt()+ new.toInt()).toString()
            new = "0"
            text_res.text = old
        }
        text_ca.setOnClickListener {
            old = "0"
            new = "0"
            text_res.text = new
        }
    }
}