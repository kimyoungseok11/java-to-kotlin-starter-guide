package com.lannstark.lec10

abstract class Animal2(protected val species: String, protected open val legCount: Int) {

    abstract fun move()

    val getSpecies: String
        get() = species

    val getLegCount: Int
        get() = legCount
}