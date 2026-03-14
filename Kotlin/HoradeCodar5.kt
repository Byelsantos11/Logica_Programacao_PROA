// Sistema bancário simples
// Autor: Gabryel

var saldo = 150.0
var nome = ""

fun main() {

    // --------------------------------------------------
    // Pergunta o nome do usuário ao entrar no sistema
    // --------------------------------------------------

    print("Digite seu nome: ")
    nome = readLine()!!

    println("\nOlá $nome é um prazer ter você por aqui!\n")

    menu()
}


// --------------------------------------------------
// MENU PRINCIPAL
// --------------------------------------------------

fun menu() {

    println("\nEscolha uma opção:")
    println("1. Ver saldo")
    println("2. Ver extrato")
    println("3. Fazer saque")
    println("4. Fazer depósito")
    println("5. Fazer transferência")
    println("6. Sair")

    val opcao = readLine()!!.toInt()

    when (opcao) {

        1 -> verSaldo()

        2 -> verExtrato()

        3 -> fazerSaque()

        4 -> fazerDeposito()

        5 -> fazerTransferencia()

        6 -> sair()

        else -> erro()
    }
}


// --------------------------------------------------
// FUNÇÃO PARA VALIDAR SENHA
// --------------------------------------------------

fun validarSenha(): Boolean {

    print("Digite sua senha: ")
    val senha = readLine()!!.toInt()

    return if (senha == 3589) {

        true

    } else {

        println("Senha incorreta!")
        false
    }
}


// --------------------------------------------------
// VER SALDO (EXIGE SENHA)
// --------------------------------------------------

fun verSaldo() {

    if (validarSenha()) {

        println("Seu saldo atual é: $saldo")

    }

    menu()
}


// --------------------------------------------------
// EXTRATO (COM DADOS FICTÍCIOS)
// --------------------------------------------------

fun verExtrato() {

    if (validarSenha()) {

        println("\n----- EXTRATO -----")
        println("Compra mercado: -50")
        println("Netflix: -30")
        println("Depósito recebido: +200")
        println("Saldo atual: $saldo")

    }

    menu()
}


// --------------------------------------------------
// DEPÓSITO
// --------------------------------------------------

fun fazerDeposito() {

    print("Qual o valor para depósito? ")
    val deposito = readLine()!!.toDouble()

    if (deposito <= 0) {

        println("Operação não autorizada")

    } else {

        saldo += deposito
        println("Depósito realizado com sucesso!")

    }

    menu()
}


// --------------------------------------------------
// SAQUE
// --------------------------------------------------

fun fazerSaque() {

    if (validarSenha()) {

        print("Qual o valor para saque? ")
        val saque = readLine()!!.toDouble()

        if (saque <= 0) {

            println("Operação não autorizada")

        } else if (saque > saldo) {

            println("Operação não autorizada")

        } else {

            saldo -= saque
            println("Saque realizado com sucesso!")

        }
    }

    menu()
}


// --------------------------------------------------
// TRANSFERÊNCIA
// --------------------------------------------------

fun fazerTransferencia() {

    if (validarSenha()) {

        print("Informe o número da conta: ")
        val conta = readLine()!!.toInt()

        print("Informe o valor da transferência: ")
        val valor = readLine()!!.toDouble()

        if (valor <= 0) {

            println("Operação não autorizada")

        } else if (valor > saldo) {

            println("Operação não autorizada")

        } else {

            saldo -= valor
            println("Transferência realizada com sucesso!")

        }
    }

    menu()
}


// --------------------------------------------------
// ERRO DE OPÇÃO
// --------------------------------------------------

fun erro() {

    println("Opção inválida! Tente novamente.")
    menu()
}


// --------------------------------------------------
// SAIR DO SISTEMA
// --------------------------------------------------

fun sair() {

    println("\n$nome, foi um prazer ter você por aqui!")

}
