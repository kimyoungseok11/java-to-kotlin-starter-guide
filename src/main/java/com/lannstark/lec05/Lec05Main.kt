package com.lannstark.lec05

fun validateScoreIsNotNegative(score: Int) {
    if(score !in 0..100) {
        throw IllegalStateException("score 범위는 0부터 100입니다")
    }
}

//자바에서는 if문은 statement -> 하나의 값으로 도출되지 않는다
//코틀린에서는 expression -> 하나의 값으로 도출되는 문장
//이 떄문에 return 구문에 if문을 사용가능함(하나의 값으로 취급할 수 있음)
//삼항연산자는 없음(if-else가 하나의 값으로 취급되기 떄문에)
fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

//switch 대신에 when
//when도 expression으로 취급
//조건부에는 어떠한 expression을 사용할 수 있음
fun getGradeWithSwitch(score: Int): String {
    return when(score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any):  Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun jugdeNumber(number: Int) {
    when(number) {
        1, 0, -1 -> println("어디서 많이 본 숫자")
        else -> println("아무것도 아님")
    }
}

//judgeNumber가 없을 수 있음
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}