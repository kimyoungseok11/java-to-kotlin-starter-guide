package com.lannstark.lec09

import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    val person = Person("김영석", 30)
    println(person.name)
    person.age = 10
}

// getter setter 생략 가능
// 이로 인해 자바처럼 필드, 프로퍼티로 개념이 나뉘지 않음
// 프로퍼티로 통칭해서 부른다
class Person(
    //생성자
    val name: String,
    var age: Int
) {

    fun changeUpperCase(): String {
        return this.name.uppercase()
    }

    //클래스가 초기화 되는 시점에 한번 호출되는 로직
    //생성자가 호출되는 시점에 호출됨
    //주생성자
    init {
        if(age <= 0) {
            throw IllegalStateException("나이는 ${age}일 수 없습니다")
        }
    }

    //부생성자
    //생성자 오버로딩
    //부생성자는 최종적으로는 this를 호출해야함
    //부생성자는 body를 가질 수 있음
    constructor(name: String): this(name, 1) {
        println("부생성자 1")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    //메소드를 프로퍼티 처럼 만들 수 있음
    val isAdult: Boolean
        get() = this.age >= 20
}