package com.example

class SistemaInterno {
    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao banco")
        } else {
            println("Falha na autenticação")
        }

    }
}