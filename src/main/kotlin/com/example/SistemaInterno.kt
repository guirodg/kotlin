package com.example

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao banco")
        } else {
            println("Falha na autenticação")
        }

    }
}