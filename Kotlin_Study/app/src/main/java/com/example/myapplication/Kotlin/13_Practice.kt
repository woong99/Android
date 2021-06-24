package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)
//    val number = array.get(100) // 인덱스에 주의 해야 한다

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

//    array.set(100,100)
    // Array 의 Bounds
    // - 처음 만들때 결정 된

    // Array를 만드는 방법(3)
    val a1 = intArrayOf(1, 2, 3) // Int 만 넣을 수 있음
    val a2 = charArrayOf('b', 'c') // Char 만 넣을 수 있음, ""는 안된다. ''만 가능. char -> '', string -> ""
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)

    // Array를 만드는 방법(4) -> lambda 를 활용한 방법
    var a5 = Array(10, { 0 }) // 첫 번째 인자 = 배열의 Size, 두 번째 인자 = { 0 } -> 모든 값이 0이 된다.
    var a6 = Array(5, { 1;2;3;4;5 }) // { 1; 2; 3; 4; 5} ';'를 이용한다.
}