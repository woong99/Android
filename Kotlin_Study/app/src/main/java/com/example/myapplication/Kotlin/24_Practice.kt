package com.example.myapplication.Kotlin


// 과제
// Night, Moster (부모)
// SuperNight, SuperMonster (자식)

fun main(array: Array<String>) {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)
    monster.attack(night)
    monster.bite(night)
}

open class Charactor(var hp: Int, val power: Int) {
    fun attack(charactor: Charactor, power: Int = this.power) {
        charactor.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp")
        else println("사망 했습니다")
    }
}


class SuperNight(hp: Int, power: Int) : Charactor(hp, power) {
    val defensePower: Int = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}

class SuperMonster(hp: Int, power: Int) : Charactor(hp, power) {
    fun bite(charactor: Charactor) {
        super.attack(charactor, power + 2)
    }
}
