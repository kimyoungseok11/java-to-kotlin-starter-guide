package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1

    //객체 비교시 자동으로 compareTo를 호출
    if(money1 > money2){
        println("Money1이 Money2보다 큽니다")
    }


    /**
     * 동등성 : 두 객체의 값이 같은가
     * 동일성 : 완전히 동일한 객체인가? 주소가 같은가?
     * java에서는 동일성에 == 동등성에 equals를 사용
     * kotlin에서는 동일성에 ===을 사용 동등성에 ==을 사용
     * ==을 사용히 equals를 호출
     */

    println(money3==money1)
    println(money3===money2)

    /**
     * 자바와 동일하게 Lazy 연산 수행
     * 앞의 조건이 true고 뒤의 조건이 false인 상황에서 or 연산자를 쓰면
     * 무조건 앞 조건 참일시 무조건 참 따라서 뒤의 연산을 수행 안함
     * 앞의 조건이 false이고 뒤의 조건의 true인 경우에 and 연산자를 쓰면
     * 무조건 앞 false이므로 뒤의 연산은 수행안함
     */
    if(fun1() || fun2()) {
        println("본문")
    }
}

fun fun1() : Boolean{
    println("fun1")
    return true
}

fun fun2() : Boolean{
    println("fun2")
    return false
}