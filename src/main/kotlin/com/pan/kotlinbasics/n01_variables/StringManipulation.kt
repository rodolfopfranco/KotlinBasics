package com.pan.kotlinbasics.n01_variables

fun findFirstChar(word: String): Char{
    return word.first()
}

fun findLastChar(word: String): Char{
    return word.last()
}

fun concatenation(first: String, second: String){
    // Many kinds of concatenation:
    println(first+second)
    println("${first} primeiro")
    println(second+" segundo")
    println("inline concatenation: $second")
    println("$first, ${second.uppercase()}")
}

fun removingBlankSpaces(word: String){
    // White Chars:
    word.trimEnd()
    word.trimStart()
    word.trim()
}

fun replaceChars(word: String, replacer: Char, replaced: Char): String{
    return word.replace(replaced, replacer)
}

fun emptyVsBlank(word: String){
    if(word.isEmpty()) println("Empty is a initialized String object without characters")
    if(word.isBlank()) println("If a String has characters but they are all white spacces, it's blank")
}