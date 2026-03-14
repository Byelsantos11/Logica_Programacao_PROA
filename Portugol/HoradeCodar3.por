programa
{
	funcao inicio()
	{

		// --------------------------------------------------
		// Declaração de variáveis
		// --------------------------------------------------

		inteiro i,n
		inteiro valor1,valor2
		real resultado
		inteiro soma,contador
		real media
		inteiro nota
		inteiro aprovados = 0
		caracter resposta
		inteiro dentro = 0
		inteiro fora = 0


		// --------------------------------------------------
		// Exercício 1 - Bomba relógio
		// --------------------------------------------------

		para(i = 30; i >= 0; i--)
		{
			escreva(i,"\n")
		}

		escreva("EXPLOSÃO\n\n")


		// --------------------------------------------------
		// Exercício 2 - Divisão com validação
		// --------------------------------------------------

		escreva("Digite o primeiro valor: ")
		leia(valor1)

		escreva("Digite o segundo valor: ")
		leia(valor2)

		enquanto(valor2 <= 0)
		{
			escreva("Valor inválido. Digite novamente: ")
			leia(valor2)
		}

		resultado = valor1 / valor2

		escreva("Resultado da divisao: ", resultado,"\n\n")


		// --------------------------------------------------
		// Exercício 3 - Números de 10 a 1
		// --------------------------------------------------

		para(i = 10; i >= 1; i--)
		{
			escreva(i," ")
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 4 - Média entre 15 e 100
		// --------------------------------------------------

		soma = 0
		contador = 0

		para(i = 15; i <= 100; i++)
		{
			soma = soma + i
			contador++
		}

		media = soma / contador

		escreva("Media: ", media,"\n\n")


		// --------------------------------------------------
		// Exercício 5 - Média entre dois números
		// --------------------------------------------------

		escreva("Digite o primeiro numero: ")
		leia(valor1)

		escreva("Digite o segundo numero: ")
		leia(valor2)

		soma = 0
		contador = 0

		para(i = valor1; i <= valor2; i++)
		{
			soma = soma + i
			contador++
		}

		media = soma / contador

		escreva("Media: ", media,"\n\n")


		// --------------------------------------------------
		// Exercício 6 - Média de alunos
		// --------------------------------------------------

		resposta = 'S'

		enquanto(resposta == 'S' ou resposta == 's')
		{

			real nota1,nota2

			escreva("Digite a primeira nota: ")
			leia(nota1)

			escreva("Digite a segunda nota: ")
			leia(nota2)

			media = (nota1 + nota2) / 2

			escreva("Media: ", media,"\n")

			se(media >= 9.5)
			{
				aprovados++
			}

			escreva("Calcular a media de outro aluno? (S/N): ")
			leia(resposta)

		}

		escreva("Quantidade de aprovados: ", aprovados,"\n\n")


		// --------------------------------------------------
		// Exercício 7 - Média de 6 notas válidas
		// --------------------------------------------------

		soma = 0

		para(i = 1; i <= 6; i++)
		{

			escreva("Digite a nota ",i,": ")
			leia(nota)

			enquanto(nota < 0 ou nota > 10)
			{
				escreva("Nota invalida. Digite novamente: ")
				leia(nota)
			}

			soma = soma + nota

		}

		media = soma / 6

		escreva("Media final: ", media,"\n\n")


		// --------------------------------------------------
		// Exercício 8 - Números de 1 até N
		// --------------------------------------------------

		escreva("Digite um valor N: ")
		leia(n)

		para(i = 1; i <= n; i++)
		{
			escreva(i," ")
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 9 - 10 números maiores que 100
		// --------------------------------------------------

		para(i = 101; i <= 110; i++)
		{
			escreva(i," ")
		}

		escreva("\n\n")


		// --------------------------------------------------
		// Exercício 10 - Valores entre 24 e 42
		// --------------------------------------------------

		inteiro valor

		para(i = 1; i <= 10; i++)
		{

			escreva("Digite um valor: ")
			leia(valor)

			se(valor >= 24 e valor <= 42)
			{
				dentro++
			}
			senao
			{
				fora++
			}

		}

		escreva("Dentro do intervalo: ", dentro,"\n")
		escreva("Fora do intervalo: ", fora,"\n\n")


		// --------------------------------------------------
		// Exercício 11 - Tabuada de 1 até N
		// --------------------------------------------------

		escreva("Digite o valor de N: ")
		leia(n)

		para(i = 1; i <= n; i++)
		{

			escreva("\nTabuada do ",i,"\n")

			inteiro j

			para(j = 1; j <= 10; j++)
			{
				escreva(i," x ",j," = ", i*j,"\n")
			}

		}

	}
}
