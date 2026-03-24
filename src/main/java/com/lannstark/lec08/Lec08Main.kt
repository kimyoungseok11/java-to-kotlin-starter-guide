package com.lannstark.lec08

//하나의 결과값이면 중괄호 대신 = 사용 가능
//=을 사용하는 경우 반환 타입 생략 가능함
//block을 사용하는 경우 타입을 작성해야함
fun max(a: Int, b: Int) = if(a > b) a else b

//파라미터의 default값을 넣을 수 있음
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for(i in 1..num) {
        if(useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

//가변인자 함수를 만들경우 vararg 키워드를 사용
fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}

fun main() {
    println(repeat("Hello world"))
    //named argument
    //builder를 사용하는 듯한 장점을 가짐
    println(repeat("Hello world", useNewLine = false))
    printNameAndGender(name = "Hello world", gender = "World")
    printAll("A","B","C")

    val array = arrayOf("A","B","C")
    //가변인자에 배열을 넣을 경우 * 연산자 사용(spread 연산자)
    printAll(*array)
}