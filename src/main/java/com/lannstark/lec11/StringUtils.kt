package com.lannstark.lec11

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
) {
    var price = _price
        private set
}