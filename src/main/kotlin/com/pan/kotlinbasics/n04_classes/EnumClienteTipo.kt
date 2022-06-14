package com.pan.kotlinbasics.n04_classes

enum class EnumClienteTipo(val descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica")
}

fun main() {
    EnumClienteTipo.values().forEach {
        println("$it.name ${it.descricao}")
    }
}