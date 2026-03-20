package com.lannstark.lec06

fun main() {
    val numbers = listOf(1L, 2L, 3L)

    //코틀린에서는 : 대신 in
    for(number in numbers) {
        println(number)
    }

    //..은 범위를 만드는 연산자(등차수열을 생성함)
    for(i in 1..3) {
        println(i)
    }

    //증감식이 -인 경우 downTo를 사용(3부터 1까지)
    //downTo는 함수임(중위함수 호출)
    for(i in 3 downTo 1) {
        println(i)
    }

    //증감식이 2씩 증가하는경우 step을 써야함
    //step은 함수임(중위함수 호출)
    for(i in 1..5 step 2) {
        println(i)
    }

    //while은 자바와 동일함
    var i = 1
    while(i<=3) {
        println(i)
        i++
    }
}