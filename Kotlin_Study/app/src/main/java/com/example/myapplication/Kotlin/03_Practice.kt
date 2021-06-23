package com.example.myapplication.Kotlin

var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 변수에 넣어 줄 수 있다.
var b = "1"
var c = b.toInt() // b를 int형으로 바꾸겠다.
var d = b.toFloat() // b를 float형으로 바꾸겠다.

var e = "John"
var f = "My name is $e Nice to meet you" // $e = 변수 e가 들어온다.

// Null
// - 존재 하지 않는다

// var abc : Int = null
var abc1: Int? = null // 자료형 뒤에 ?가 붙으면 Null을 가질 수 있다.
var abc2: Double? = null

var g = a + 3

fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc2)

    println(g)
}