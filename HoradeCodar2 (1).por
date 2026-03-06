programa
{
	funcao inicio()
	{

		// --------------------------------------------------
		// Declaração de variáveis
		// --------------------------------------------------

		inteiro n1,n2,n3,n4,n5,n6
		inteiro numero
		real soma,media
		inteiro anoNascimento,idade,anoAtual
		real altura,pesoIdeal
		inteiro genero
		inteiro operacao


		// --------------------------------------------------
		// Exercício 1 - Maior entre dois números
		// --------------------------------------------------

		escreva("Digite o primeiro numero: ")
		leia(n1)

		escreva("Digite o segundo numero: ")
		leia(n2)

		se (n1 > n2)
		{
			escreva("\nMaior numero: ", n1)
		}
		senao
		{
			escreva("\nMaior numero: ", n2)
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 2 - Positivo, negativo ou zero
		// --------------------------------------------------

		escreva("Digite um numero: ")
		leia(numero)

		se (numero > 0)
		{
			escreva("Numero positivo")
		}
		senao se (numero < 0)
		{
			escreva("Numero negativo")
		}
		senao
		{
			escreva("Numero é zero")
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 3 - Maior entre três números
		// --------------------------------------------------

		leia(n1)
		leia(n2)
		leia(n3)

		se (n1 > n2 e n1 > n3)
		{
			escreva("Maior: ", n1)
		}
		senao se (n2 > n1 e n2 > n3)
		{
			escreva("Maior: ", n2)
		}
		senao
		{
			escreva("Maior: ", n3)
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 4 - Soma dos dois maiores
		// --------------------------------------------------

		leia(n1)
		leia(n2)
		leia(n3)

		se (n1 < n2 e n1 < n3)
		{
			soma = n2 + n3
		}
		senao se (n2 < n1 e n2 < n3)
		{
			soma = n1 + n3
		}
		senao
		{
			soma = n1 + n2
		}

		escreva("Soma dos dois maiores: ", soma)

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 5 - Média de seis números
		// --------------------------------------------------

		soma = 0

		leia(n1)
		leia(n2)
		leia(n3)
		leia(n4)
		leia(n5)
		leia(n6)

		soma = n1+n2+n3+n4+n5+n6
		media = soma/6

		escreva("Media: ", media)

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 6 - Primeiro, último e maior
		// --------------------------------------------------

		leia(n1)
		leia(n2)
		leia(n3)
		leia(n4)

		escreva("Primeiro: ", n1)
		escreva("\nUltimo: ", n4)

		se (n1>n2 e n1>n3 e n1>n4)
		{
			escreva("\nMaior: ", n1)
		}
		senao se (n2>n1 e n2>n3 e n2>n4)
		{
			escreva("\nMaior: ", n2)
		}
		senao se (n3>n1 e n3>n2 e n3>n4)
		{
			escreva("\nMaior: ", n3)
		}
		senao
		{
			escreva("\nMaior: ", n4)
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 7 - Somar números menores que 72
		// --------------------------------------------------

		soma = 0

		leia(n1)
		leia(n2)
		leia(n3)
		leia(n4)
		leia(n5)
		leia(n6)

		se (n1 < 72) soma = soma + n1
		se (n2 < 72) soma = soma + n2
		se (n3 < 72) soma = soma + n3
		se (n4 < 72) soma = soma + n4
		se (n5 < 72) soma = soma + n5
		se (n6 < 72) soma = soma + n6

		escreva("Soma: ", soma)

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 8 - Média entre 0 e 10
		// --------------------------------------------------

		leia(n1)
		leia(n2)
		leia(n3)
		leia(n4)

		se (n1>0 e n1<10 e n2>0 e n2<10 e n3>0 e n3<10 e n4>0 e n4<10)
		{
			media = (n1+n2+n3+n4)/4

			se (media > 5)
			{
				escreva("Voce passou no teste")
			}
			senao
			{
				escreva("Tente novamente")
			}
		}
		senao
		{
			escreva("Numeros invalidos")
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 9 - Pode votar
		// --------------------------------------------------

		anoAtual = 2026

		escreva("Digite o ano de nascimento: ")
		leia(anoNascimento)

		idade = anoAtual - anoNascimento

		se (idade >= 16)
		{
			escreva("Pode votar este ano")
		}
		senao
		{
			escreva("Nao pode votar")
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 10 - Peso ideal
		// --------------------------------------------------

		escreva("Digite sua altura: ")
		leia(altura)

		escreva("Genero (1 feminino / 2 masculino): ")
		leia(genero)

		se (genero == 1)
		{
			pesoIdeal = (62.1 * altura) - 44.7
		}
		senao
		{
			pesoIdeal = (72.7 * altura) - 58
		}

		escreva("Peso ideal: ", pesoIdeal)

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 11 - Micro calculadora
		// --------------------------------------------------

		escreva("Digite primeiro numero: ")
		leia(n1)

		escreva("Digite segundo numero: ")
		leia(n2)

		escreva("Operacao (1 soma / 2 subtracao / 3 divisao / 4 multiplicacao): ")
		leia(operacao)

		se (operacao == 1)
		{
			escreva("Resultado: ", n1+n2)
		}
		senao se (operacao == 2)
		{
			escreva("Resultado: ", n1-n2)
		}
		senao se (operacao == 3)
		{
			escreva("Resultado: ", n1/n2)
		}
		senao
		{
			escreva("Resultado: ", n1*n2)
		}

	}
}