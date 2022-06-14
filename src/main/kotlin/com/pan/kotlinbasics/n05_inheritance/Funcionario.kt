package com.pan.kotlinbasics.n05_inheritance

import java.math.BigDecimal

// Inheritance on praxis:

class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {

}