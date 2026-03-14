programa
{

	// saldo inicial da conta
	real saldo = 150.00

	// nome do usuário
	cadeia nome

	funcao inicio() {

		inteiro opcao

		// --------------------------------------------------
		// Pergunta o nome do usuário ao entrar no sistema
		// --------------------------------------------------

		escreva("Digite seu nome: ")
		leia(nome)

		escreva("\nOlá ", nome ," é um prazer ter você por aqui!\n\n")

		menu()

	}


	// --------------------------------------------------
	// MENU PRINCIPAL
	// --------------------------------------------------

	funcao menu(){

		inteiro opcao

		escreva("\nEscolha uma opção:\n")
		escreva("1. Ver saldo\n")
		escreva("2. Ver extrato\n")
		escreva("3. Fazer saque\n")
		escreva("4. Fazer depósito\n")
		escreva("5. Fazer transferência\n")
		escreva("6. Sair\n")

		leia(opcao)

		// uso do escolha/caso (switch)
		escolha(opcao){

			caso 1:
				verSaldo()
			pare

			caso 2:
				verExtrato()
			pare

			caso 3:
				fazerSaque()
			pare

			caso 4:
				fazerDeposito()
			pare

			caso 5:
				fazerTransferencia()
			pare

			caso 6:
				sair()
			pare

			caso contrario:
				erro()

		}

	}


	// --------------------------------------------------
	// FUNÇÃO PARA VALIDAR SENHA
	// --------------------------------------------------

	funcao logico validarSenha(){

		inteiro senha

		escreva("Digite sua senha: ")
		leia(senha)

		se(senha == 3589){
			retorne verdadeiro
		}
		senao{
			escreva("Senha incorreta!\n")
			retorne falso
		}

	}


	// --------------------------------------------------
	// VER SALDO (EXIGE SENHA)
	// --------------------------------------------------

	funcao verSaldo(){

		se(validarSenha()){

			escreva("Seu saldo atual é: ", saldo, "\n")

		}

		menu()

	}


	// --------------------------------------------------
	// EXTRATO (COM DADOS FICTÍCIOS)
	// --------------------------------------------------

	funcao verExtrato(){

		se(validarSenha()){

			escreva("\n----- EXTRATO -----\n")
			escreva("Compra mercado: -50\n")
			escreva("Netflix: -30\n")
			escreva("Depósito recebido: +200\n")
			escreva("Saldo atual: ", saldo,"\n")

		}

		menu()

	}


	// --------------------------------------------------
	// DEPÓSITO
	// --------------------------------------------------

	funcao fazerDeposito(){

		real deposito

		escreva("Qual o valor para depósito? ")
		leia(deposito)

		// valida se o valor é válido
		se(deposito <= 0){

			escreva("Operação não autorizada\n")

		}
		senao{

			saldo = saldo + deposito

			escreva("Depósito realizado com sucesso!\n")

		}

		menu()

	}


	// --------------------------------------------------
	// SAQUE
	// --------------------------------------------------

	funcao fazerSaque(){

		se(validarSenha()){

			real saque

			escreva("Qual o valor para saque? ")
			leia(saque)

			// verifica se valor é válido
			se(saque <= 0){

				escreva("Operação não autorizada\n")

			}
			senao se(saque > saldo){

				escreva("Operação não autorizada\n")

			}
			senao{

				saldo = saldo - saque

				escreva("Saque realizado com sucesso!\n")

			}

		}

		menu()

	}


	// --------------------------------------------------
	// TRANSFERÊNCIA
	// --------------------------------------------------

	funcao fazerTransferencia(){

		se(validarSenha()){

			inteiro conta
			real valor

			escreva("Informe o número da conta: ")
			leia(conta)

			escreva("Informe o valor da transferência: ")
			leia(valor)

			se(valor <= 0){

				escreva("Operação não autorizada\n")

			}
			senao se(valor > saldo){

				escreva("Operação não autorizada\n")

			}
			senao{

				saldo = saldo - valor

				escreva("Transferência realizada com sucesso!\n")

			}

		}

		menu()

	}


	// --------------------------------------------------
	// ERRO DE OPÇÃO
	// --------------------------------------------------

	funcao erro(){

		escreva("Opção inválida! Tente novamente.\n")

		menu()

	}


	// --------------------------------------------------
	// SAIR DO SISTEMA
	// --------------------------------------------------

	funcao sair(){

		escreva("\n",nome,", foi um prazer ter você por aqui!\n")

	}

}
