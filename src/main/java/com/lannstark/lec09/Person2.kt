package com.lannstark.lec09

fun main() {
    val person = Person2("ddd", 18)
    println(person.age)
    person.age = 10
    println(person.age)
    person.name = "gadsf".uppercase()
    val baby = Person2.baby("Tom")
    val baby2 = Person2.baby("Tom")

    println(baby)
    println(baby2)
}

class Person2(var name: String, var age: Int) {
    init {
        if (age <=0 ){
            throw IllegalStateException("나이는 ${age}일 수 없습니다")
        }
    }

    companion object {
        var instance: Person2? = null

        fun baby(name: String): Person2 {
            if(instance == null) {
                instance = Person2(name = name, age = 1)
                return instance!!
            }

            return instance!!
        }
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

    val convertUpper: String
        get() = this.name.uppercase()
}