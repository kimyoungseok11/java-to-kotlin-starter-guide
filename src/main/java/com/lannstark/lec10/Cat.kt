package com.lannstark.lec10

//코틀린에서는 상속받을 때 상위 클래스의 생성자를 바로 호출해야함
class Cat(species: String) : Animal(species, 4) {
    override fun move() {
        println("Moving from KotlinCat")
    }
}