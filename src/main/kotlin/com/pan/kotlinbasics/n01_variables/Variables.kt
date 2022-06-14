package com.pan.kotlinbasics.n01_variables

class Variables {
    // mutable value:
    var mutable : String? = null

    // Immutable value:
    val immutable: String? = null

    // Constant Value:
    companion object {
        const val CONSTANT_VALUE: String = "null"
    }

    var listMutableInt: MutableList<Int> = mutableListOf()
}

fun nullability(){
    var nullifiedVariable: Int? = null
    // This one results in an error:
    // var errorOnNull:Int = null
}

fun main() {
    //Declaration with type inference:
    var varDeclarration = 22

    // Declaration with explicit type:
    var varDeclarationWithPostAttribution : Int
    varDeclarationWithPostAttribution = 22
    varDeclarationWithPostAttribution = 33

    // Getting String form number values
    var numberValue = 2021
    var stringValue = 2021.toString()

    nullability()
}