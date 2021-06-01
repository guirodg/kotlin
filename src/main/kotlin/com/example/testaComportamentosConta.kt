package com.example

fun testaComportamentosConta() {
    val contaGui = ContaCorrente(titular = "Guilherme", numero = 1000)
    contaGui.deposita(300.0)
    println("Titular: " + contaGui.titular)
    println("Numero: " + contaGui.numero)
    println("Saldo: " + contaGui.saldo)
    println()

    val contaDois = ContaPoupanca(titular = "ContaDois", numero = 2000)
    println("Titular: " + contaDois.titular)
    println("Numero: " + contaDois.numero)
    println("Saldo: " + contaDois.saldo)
    println()

    if (contaGui.tranfere(valor = 100.0, destino = contaDois)) {
        println("Transferencia sucedida")
    } else {
        println("Falha")
    }

    println("SALDO GUI: " + contaGui.saldo)
    println("SALDO DOIS: " + contaDois.saldo)
}