package com.lannstark.lec01;

fun main() {
    /**
     * 자바에서는 long Long이 구별(기본, 참조 타입)
     * 코틀린에서는 내부적으로 컴파일 단계에서 참조가 기본타입으로 변화
     * 기본 타입을 기본적으로 사용 안함(null 허용 때문)
     */
    var number1 = 10L
    val number2 = 10L

    //값을 할당하지 않을거면 타입을 명시
    var number3: Long

    //null이 오는것을 허용하려면 타입?
    var number4: Long? = null

    //클래스를 객체화 할 시 new가 필요 없음
    var person1 = Person("Lannstark")

    println(number1)
}