package com.example.myapplication.Kotlin


// 23. 상속
// 부모로부터 설명서를 물려받는다!


fun main(array: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
}

open class Car100() {
    open fun drive(): String {
        return "달린다"
    }

    fun stop() {}
}

// 커맨드 + n -> Override Methods 클릭
class SuperCar100() : Car100() {
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}

class Bus100() : Car100() {

}