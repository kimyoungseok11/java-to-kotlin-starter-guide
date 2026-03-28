package com.lannstark.lec10

//부모 클래스 상속과 인터페이스 구현은 모두 : 을 사용함
class Penguin(
    species: String, override val swimAbility: Int
) : Animal(species, 2), Swimmable, Flyable {

    private val wingCount = 2

    override fun move() {
        println("Moving from KotlinCat")
    }

    //코틀린에서는 프로퍼티를 override 할때는 open을 붙여야함
    override val legCount: Int
        get() = super.legCount + this.wingCount

    //중복되는 인터페이스를 특정할때 super<type>.함수를 사용
    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }
}