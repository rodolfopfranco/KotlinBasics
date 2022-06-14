package com.pan.kotlinbasics.n03_controlStructures

fun whileStructure(countdown: Int){
    var counter = countdown
    while(counter>0){
        println(counter)
        counter--
    }
}

fun ifs(word: String){
    if(word.length>0){
        println("String size bigger than one")
    } else if (word.length<0){
        println("String is smaller than zero")
    } else {
        println("String so smol")
    }
}

fun whens(word: String){
    when{
        word.length>0 -> {
            println("String size bigger than one")
        }
        word.length<0 -> {
            println("String is smaller than zero")
        }
        else ->{
            println("String so smol")
        }
    }
}

fun whensLikeACase(word:String){
    when(word.length.toInt()){
        in 0 .. Int.MAX_VALUE -> {
            println("String size bigger than one")
        }
        in Int.MIN_VALUE .. 0 -> {
            println("String is smaller than zero")
        }
        else ->{
            println("String so smol")
        }
    }
}

fun elvisOperator(word : String){
    // If null, gives the default value
    val a:Int? = null
    val b = a?: 0
}