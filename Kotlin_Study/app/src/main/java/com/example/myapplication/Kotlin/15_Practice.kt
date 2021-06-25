package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a)
    a.add(0, 100) // 기존에 값이 있으면 옆으로 밀고 삽입
    println(a)
    a.set(0, 200)
    println(a)
    a.removeAt(1) // 해당 인덱스 삭
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    println()
    b.add(2) // Set은 인덱스가 없기 때문에 add함수에 인덱스를 넣지 않는다.
    println(b)
    b.remove(2)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)
}