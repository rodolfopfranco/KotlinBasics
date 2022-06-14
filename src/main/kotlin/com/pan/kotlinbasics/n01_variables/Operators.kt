package com.pan.kotlinbasics.n01_variables

fun sum(a:Double, b:Double): Double{
    a.plus(b)
    var localA = a
    localA += b
    return a+b
}

fun subtraction(a: Double, b: Double): Double {
    a.minus(b)
    var localA = a
    localA -= b
    return a-b
}

fun multiply(a: Double, b: Double): Double{
    a.times(b)
    var localA = a
    localA *= b
    return a*b
}

fun divide(a : Double, b : Double) : Double {
    a.div(b)
    var localA = a
    localA /= b
    return a/b
}

fun module(a : Double, b : Double) : Double {
    a.mod(b)
    var localA = a
    localA %= b
    return a%b
}

fun bigger (a : Double, b : Double): Double {
    // returns the biggest number
    a.compareTo(b)
    if (a > b) return a
    return b
}

fun smaller (a: Double, b: Double): Double {
    a.compareTo(b)
    if (a<b) return a
    return b
}

fun equal (a: Double, b: Double): Boolean {
    a.equals(b)
    return a == b
}

fun different (a: Double, b:Double): Boolean {
    !(a.equals(b))
    return a!= b
}

fun andOr(a: Double, b: Double): Boolean{
    if ((a>b || a== 1.0) && a<b)
        return true
    return false
}

fun intoSomething(listInt: MutableList<Int>): Boolean{
    // Verifies if something is into a collection:
    return 2 in listInt
}

fun range (start: Int, end: Int): MutableList<Int>{
    var listInt : MutableList<Int> = mutableListOf()
    for (i in start .. end){
        listInt.add(i)
    }
    return listInt
}

fun randomNumberGenerator (): Int {
    return (1..100).random()
}


fun main() {

}