package com.lannstark.lec09

class PersonRemind(val name:String, var age:Int) {
    init {
        if(age <= 0) {
            throw IllegalStateException("error!")
        }
    }

    constructor(name: String): this(name,1)

    //정적 팩토리 메소드
    companion object {
        fun staticMethod(name: String): PersonRemind {
            return PersonRemind(name,1)
        }
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val changeUpperCase: String
        get() = this.name.uppercase()

    val isAdult: Boolean
        get() = this.age >= 20
}

fun main() {
    var person = PersonRemind("REMIND",10);
    println(person.name)
    println(person.age)
    var person1 = PersonRemind.staticMethod("factory method")
    println(person1.name)
    println(person1.isAdult)
    println(person1.changeUpperCase)
}