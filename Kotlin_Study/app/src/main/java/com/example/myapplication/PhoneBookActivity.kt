package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.phone_item.*

class PhoneBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book)

        val phoneList = ArrayList<Phonelist>()
        phoneList.add(Phonelist("신다은"))
        phoneList.add(Phonelist("신다은"))

        val container = findViewById<LinearLayout>(R.id.phonebook_container)
        val inflater = LayoutInflater.from(this@PhoneBookActivity)
        for (i in 0 until phoneList.size) {
            val itemView = inflater.inflate(R.layout.phone_item, null)
            val phoneNameView = itemView.findViewById<TextView>(R.id.name)

            phoneNameView.text = phoneList[i].name
            container.addView(itemView)
        }
        name.setOnClickListener {
            val intent = Intent(this@PhoneBookActivity, PhoneBookActivity2::class.java)
            startActivity(intent)
        }
    }
}

class Phonelist(val name: String) {

}