package com.lannstark.lec02

/**
 * 코틀린은 null이 가능한 타입을 다르게 취급
 * safe call = null인 경우 null을 반환하고 아닌 경우 메소드 실행 가능하도록
 * 타입? 뒤에 null의 올 수 있다고 했기 때문
 */
fun main() {
    var str: String? = "ABC"
    println(str?.length)

    /**
     * elvis call
     * a ?: b
     * a의 결과가 null인 경우 b을 반환
     */
    println(str?.length ?: 0)

    val person = Person("Lannstark")
    startWithA(person.name)
}

fun startWithA(str : String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalStateException("null이 들어옴");
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A") ?: null
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

//!!은 절대로 null이 될 수 없다는 뜻임(nullable)
fun startWithA4(str: String?): Boolean {
    return str!!.startsWith("A");
}