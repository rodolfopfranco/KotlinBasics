package com.pan.kotlinbasics.n05_inheritance

// Like an Abstract Class:

open class Pessoa(
    open val nome: String,
    open val cpf: String
) {
}