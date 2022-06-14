package com.pan.kotlinbasics.n04_classes

fun main() {
    // Um tipo de criação de objeto:
    val bancoTeste = DataClassBanco("Banco de Teste", 3)
    println(bancoTeste)
    // Com os nomes:
    val bancoComNomesNosAtributos = DataClassBanco(numero = 3, nome = "Banco atribuído na Mão")
}