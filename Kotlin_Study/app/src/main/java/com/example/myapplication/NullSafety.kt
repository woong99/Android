package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class NullSafety : AppCompatActivity() {

    lateinit var lateCar: Car

    class Car(var number: Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number: Int = 10
        // val number1: Int = null
        val number1: Int? = null

        //val number5: Int = number1 + 10 // 에러 : number1의 타입이 Int일 수도 Null일 수도 있다
        val number5: Int = number1!! + 10 // number1이 Null이 아니라는 것을 개발자가 보증, 비추!!

//        val number3 =  number? + number1
        val number3 = number1?.plus(number) // ~~?.Plus, Minus 등등 문법이 있다, number1이 null이 아니면 실행
        Log.d("number", "number3 : " + number3)


        // 삼항연산자 -> 엘비스 연산자 (?:)
        // Null Safety를 위한 것
        val number4 = number1 ?: 10 // number1이 Null이면 10
        Log.d("number", "number4 : " + number4)

        Log.d("number", "late car : " + lateCar.number)
        lateCar = Car(10)

    }

    fun plus(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }
}