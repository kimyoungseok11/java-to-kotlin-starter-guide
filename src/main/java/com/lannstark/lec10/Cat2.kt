package com.lannstark.lec10

class Cat2(species: String) : Animal2(species, 4)  {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}