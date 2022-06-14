package com.pan.kotlinbasics.n02_functions

import java.lang.Integer.sum

// Gets data and a function to return a value:
val x = calculate(12, 4, ::sum)

// Also with Lambda:
val y = calculate(12,4){a,b->a*b}

fun calculate(n1: Int, n2: Int, operation:(Int, Int)->Int): Int{
    val result = operation(n1, n2)
    return result
}

// A Function created for a type:
// Now String typed variables are able to uppercase only the first char:
fun String.newFunction() = this[(0)].uppercase()

fun usingCreatedFunction(){
    var thing = "thing"
    println(thing.newFunction())
}