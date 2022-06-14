package com.pan.kotlinbasics.n04_classes

class ConstructorPessoa {

    var nome: String = "Stix"
    var cpf: String = "1.2.3-4"

    fun pessoaInfo() = "$nome $cpf"

    constructor()
}