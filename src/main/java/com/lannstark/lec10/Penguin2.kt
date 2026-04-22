package com.lannstark.lec10

class Penguin2(species: String) : Animal2(species, 2), Swimmable2, Flyable2 {

    var wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable2>.act()
        super<Flyable2>.act()
    }

    override val swimAbility: Int
        get() = 3
}