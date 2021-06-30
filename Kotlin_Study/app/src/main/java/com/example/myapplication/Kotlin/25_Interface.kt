package com.example.myapplication.Kotlin

// 25. Interface
// - 인터페이스는 약속!

interface Person_ {
    fun eat()
    fun sleep()
}

open class Person() {
    fun eat() {

    }

    fun sleep() {}

}

class Student() : Person() {}
class Teacher() : Person() {}