package com.example

fun testaFuncionarios() {
    val gui = Analista(
        nome = "Guilherme",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    println("nome : ${gui.nome}")
    println("cpf : ${gui.cpf}")
    println("salario : ${gui.salario}")
    println("bonificação ${gui.bonificacao()}")

    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome : ${fran.nome}")
    println("cpf : ${fran.cpf}")
    println("salario : ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if (fran.autentica(senha = 1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    println()

    val alan = Diretor(
        nome = "Alan",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1234,
        plr = 100.0
    )

    println("nome : ${alan.nome}")
    println("cpf : ${alan.cpf}")
    println("salario : ${alan.salario}")
    println("PL : ${alan.plr}")
    println("bonificação ${alan.bonificacao()}")

    if (alan.autentica(senha = 1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }


    val maria = Analista(
        nome = "Fran",
        cpf = "444.444.444-44",
        salario = 3000.0,
    )

    println("nome : ${maria.nome}")
    println("cpf : ${maria.cpf}")
    println("salario : ${maria.salario}")
    println("bonificação ${maria.bonificacao()}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gui)
    calculadora.registra(fran)
    calculadora.registra(alan)
    calculadora.registra(maria)

    println("Total de bonificação: ${calculadora.total}")
}