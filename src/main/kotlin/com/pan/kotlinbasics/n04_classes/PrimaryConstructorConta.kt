package com.pan.kotlinbasics.n04_classes

import java.math.BigDecimal

// Primary constructor with attributes inside

class PrimaryConstructorConta(
    var numero: String,
    var agencia: String,
    var saldo: BigDecimal
) {

    fun deposito(valor: BigDecimal){
        this.saldo += valor
    }

    fun saque(valor: BigDecimal){
        this.saldo -= valor
    }
}