package com.example

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Guilherme",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo apos saque corrente: ${contaCorrente.saldo}")
    println("saldo apos saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.tranfere(100.0, contaPoupanca)

    println("saldo apos transferir para poupança: ${contaCorrente.saldo}")
    println("saldo apos receber tranferencia poupança: ${contaPoupanca.saldo}")
}