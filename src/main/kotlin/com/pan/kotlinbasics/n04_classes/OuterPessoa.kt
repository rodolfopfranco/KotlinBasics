package com.pan.kotlinbasics.n04_classes

// Outer Class, Inner Class
class OuterPessoa {
    var nome: String = "Ariel"
    var cpf: String = "123.456.789-22"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main() {
    var ariel = OuterPessoa()
    println(ariel.nome)
    println(ariel.cpf)
    println(ariel.Endereco().rua)
}