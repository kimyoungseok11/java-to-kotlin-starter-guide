package com.lannstark.lec03

/**
 * 코틀린에서는 암시적 형변환이 불가능함
 * Int형의 변수를 Long에 할당하려면 명시적 형변환 필요
 */
fun main() {
    val number1: Int = 3
    val number2: Long = number1?.toLong() ?: 0L

    val person = Person("ㅇㅇㅇ", 100);

    printAgeIfPerson(person)

    //문자열 이어서 쓸 경우 ${}안에 변수 넣으면서 하면 편리
    println("이름 ${person.name} 나이 ${person.age}")

    //줄바꿈 문자열 입력
    """
        asdlfkn
        sdfnalsk
        laskdnf
    """.trimIndent()

    val str = "ABC"
    println(str[0])
    println(str[2])
}

// is는 자바의 instanceof
// as? -> obj가 null이 아나리면 뒤에 있는 Person이 됨
// Any는 java의 Object 타입
// Unit은 java의 void와 동일
// Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현
fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person)
}