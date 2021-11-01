package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PhoneBookActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book2)
    }
}

class PhoneBook() {
    val personList = ArrayList<Person>()
    
    fun addPerson(person: Person) {
        personList.add(person)
    }
}

class Person(val name: String, var number: String)

