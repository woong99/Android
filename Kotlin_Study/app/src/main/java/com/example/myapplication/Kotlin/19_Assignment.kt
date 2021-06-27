package com.example.myapplication.Kotlin


// 1) 사직 연산을 수행할 수 있는 클래스

// 가장 쉬운 방법
class Calculator(var a: Int, var b: Int) {
    fun plus(): Int {
        return a + b
    }

    fun minus(): Int {
        return a - b
    }

    fun multi(): Int {
        return a * b
    }

    fun div(): Int {
        if (b > a) {
            var temp: Int
            temp = a
            a = b
            b = temp
        }
        return a / b
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var sum: Int = 0
        numbers.forEach {
            sum += it
        }
        return sum
    }

    fun minus(vararg numbers: Int): Int {
        var sum: Int = numbers[0]
        for (i in 1 until numbers.size) {
            sum -= numbers[i]
        }
        return sum
    }

    fun multi(vararg numbers: Int): Int {
        var sum: Int = 1
        numbers.forEach {
            sum *= it
        }
        return sum
    }

    fun div(vararg numbers: Int): Int {
        var sum: Int = numbers[0]
        for (i in 1 until numbers.size) {
            if (numbers[i] != 0)
                sum /= numbers[i]
        }
        return sum
    }
}

class Calculator3(val initialValue: Int) {
    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun printCal() {
        println(this.initialValue)
    }
}

// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일, 초기 금액)
//      - 잔고를 확인하는 기능
//      - 출금 기능
//      - 예금 기능

class Account {
    val name: String
    val year: Int
    var deposit: Int

    constructor(name: String, year: Int, deposit: Int) {
        this.name = name
        this.year = year
        if (deposit >= 0)
            this.deposit = deposit
        else
            this.deposit = 0
    }

    fun printDps() {
        println(this.deposit)
    }

    fun withdraw(amount: Int) {
        if (amount > deposit) {
            println("잔액이 부족합니다.")
        } else {
            this.deposit -= amount
        }
    }

    fun save(amount: Int) {
        this.deposit += amount
    }
}

class Account2(val name: String, val year: Int, var deposit: Int = 1000) {
    fun printDps() {
        println(this.deposit)
    }

    fun withdraw(amount: Int) {
        if (amount > deposit) {
            println("잔액이 부족합니다.")
        } else {
            this.deposit -= amount
        }
    }

    fun save(amount: Int) {
        this.deposit += amount
    }
}

class Account3(initialBalance: Int) {

    val balance: Int = if (initialBalance >= 0) initialBalance else 0
    fun checkBalance(): Int {
        return balance
    }
}

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K가 3개)

class TV(val channels: List<String>) {
    var onOrOff: Boolean = false
    var currentChannelNumber = 0
        set(value) {
            field = value
            if (field >= channels.size)
                field = 0
            else if (field < 0)
                field = channels.size - 1
        }
        get() {
            println("호춣되었습니다.")
            return field
        }

    fun switch() {
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        ++currentChannelNumber
    }


    fun channelDown() {
        --currentChannelNumber
    }

}

fun main(array: Array<String>) {
    println("---------------1번 문제---------------")
    val cal = Calculator(10, 30)
    println(cal.plus())
    println(cal.minus())
    println(cal.multi())
    println(cal.div())
    println()

    val cal2 = Calculator2()
    println(cal2.plus(10, 20, 30))
    println(cal2.minus(100, 20, 30))
    println(cal2.multi(10, 20, 30))
    println(cal2.div(100, 0, 5))
    println()

    val cal3 = Calculator3(10)
    cal3.plus(10).printCal()

    println("---------------2번 문제---------------")
    val acc = Account("정웅교", 1109, 10000)
    acc.printDps()
    acc.withdraw(100000)
    acc.withdraw(1000)
    acc.printDps()
    acc.save(100000)
    acc.printDps()
    println()
    val acc2 = Account("정웅교", 1109, -2000)
    acc2.printDps()
    println()
    val acc3 = Account2("정웅교", 1109)
    acc3.printDps()
    val acc4 = Account2("정웅교", 1109, 2000)
    acc4.printDps()
    println()
    println("---------------3번 문제---------------")
    val channels = listOf<String>("K", "M", "S")
    val tv = TV(channels)
    println(tv.onOrOff)
    tv.switch()
    println(tv.onOrOff)
    println(tv.checkCurrentChannel())
    tv.channelUp()
    tv.channelUp()
    tv.channelUp()
    tv.channelUp()
    tv.channelUp()
    tv.channelUp()
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    tv.channelDown()
    tv.channelDown()
    tv.channelDown()
    tv.channelDown()
    println(tv.checkCurrentChannel())
}