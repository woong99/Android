package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PhoneBookActivity_Real : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_real)
    }
}

class PhoneBook() {
    // 전화번호부
}

class Person(val name: String)