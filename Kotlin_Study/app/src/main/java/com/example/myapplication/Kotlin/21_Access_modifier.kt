package com.example.myapplication.Kotlin


// 23. 접근 제어자

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("정웅교")
//    testAccess.test()
//    t estAccess.name = "아무개"
//    println(testAccess.name)

}

class TestAccess {
    private var name: String = "홍길동" // 외부에서 접근 불가능

    constructor(name: String) {
        this.name = name
    }
    fun changeName(newName:String){
        this.name = newName
    }

    private fun test(){
        println("테스트")
    }
}
