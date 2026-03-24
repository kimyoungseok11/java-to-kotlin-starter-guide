package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalStateException("주어진 ${str}은 숫자가 아닙니다")
    }
}

//try-catch도 expression으로 취급
fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

//checked exception, unchecked exception을 구분 안함
//전부 unchecked exception으로 간주함
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

//kotlin에서는 try-with-resources가 사라지고 use를 씀
fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}

fun main() {
    readFile()
}