package com.lannstark.lec12

fun main() {

}

class Person private constructor(var name: String, var age: Int) {

    //여기 안에 있으면 static 처럼 사용함
    companion object Factory : Log {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체예요")
        }
    }
}