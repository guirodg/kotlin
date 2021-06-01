package com.example

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Guilheme",
        cpf = "111-111-111-11",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222-222-222-22",
        salario = 2000.0,
        senha = 4321,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1234)
    sistemaInterno.entra(diretor, 43212)
    sistemaInterno.entra(cliente, 1234)
}