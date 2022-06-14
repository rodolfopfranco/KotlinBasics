package com.pan.kotlinbasics.x_amples

class StockCalculator {
}

fun main() {
    println("Informe o valor inicial a ser aplicado:")
    var valorInicial = readLine()!!.toFloat()
    println("Informe a quantidade de meses:")
    var meses = readLine()!!.toInt()
    println("informe o aporte Mensal:")
    var aporteMensal = readLine()!!.toFloat()
    println("Informe a porcentagem do rendimento anual:")
    var rendimentoMensal =  readLine()!!.toFloat()/12

    var valorTotal = valorInicial
    for(i in 1..meses){
        valorTotal += valorTotal/100 * rendimentoMensal
        valorTotal += aporteMensal
    }
    var investido = valorInicial+(aporteMensal*meses)
    println("Valor Total: "+valorTotal)
    println("Investido: "+investido)
    var diferenca = valorTotal-investido
    println("Diferença: "+diferenca)
    println("Por mês: "+ (valorTotal/100 * rendimentoMensal))
}