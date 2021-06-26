package com.example.myapplication.Kotlin


// 1번 문제
// List를 두 개 만든다
// 첫 번째 List에는 0 부터 9까지 값을 넣는다 (반복문 사용)
// 두 번째 List에는 첫 번째 List의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False를 넣어 준다.

fun sol1() {
    var list1 = mutableListOf<Int>()
    var list2 = mutableListOf<Boolean>()
    for (i in 0..9) {
        list1.add(i)
    }
    list1.forEach {
        if (it % 2 == 0)
            list2.add(true)
        else
            list2.add(false)
    }
    println("----------1번 문제----------")
    println(list1)
    println(list2)
}

// 2번 문제
// 학점을 구하자
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C
// 나머지 F

fun sol2(first: Int): Char {
    when (first) {
        in 80..90 -> return 'A'
        in 70..80 -> return 'B'
        in 60..70 -> return 'C'
        else -> return 'F'
    }
}

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두 자리 숫자이다

fun sol3(first: Int): Int {
    var n: Int = first
    var sum: Int = 0
    while (n > 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}

// 4번 문제
// 구구단을 출력하자

fun sol4() {
    for (i in 1..9) {
        for (k in 1..9) {
            println("$i * $k = ${i * k}")
        }
    }
}

fun main(array: Array<String>) {
    sol1()
    println("\n----------2번 문제----------")
    println(sol2(70))
    println("\n----------3번 문제----------")
    println(sol3(67))
    println("\n----------4번 문제----------")
    sol4()


}


