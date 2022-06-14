package com.pan.kotlinbasics.n02_functions

fun fullNameLvl1(firstName: String, lastName: String): String{
    val fullName = "$firstName $lastName"
    return fullName
}

fun fullNameLvl2(firstName: String, lastName: String): String{
    return "$firstName $lastName"
}

fun fullNameLvl3(firstName: String, lastName: String) = "$firstName $lastName"