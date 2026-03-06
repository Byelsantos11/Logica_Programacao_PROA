// Programa com vários exercícios de lógica
// Autor: Gabryel


programa
{
	funcao inicio()
	{

		// -----------------------------
		// EXERCÍCIO 1
		// Criar uma variável chamada nome_do_carro
		// -----------------------------

		cadeia nome_do_carro = "Fusca"

		escreva("Exercício 1\n")
		escreva("O nome do carro é: ", nome_do_carro, "\n\n")


		// -----------------------------
		// EXERCÍCIO 2
		// Usuário informa o nome
		// -----------------------------

		cadeia nome

		escreva("Exercício 2\n")
		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Olá, ", nome, "\n\n")


		// -----------------------------
		// EXERCÍCIO 3
		// Usuário informa nome e idade
		// -----------------------------

		inteiro idade

		escreva("Exercício 3\n")
		escreva("Digite seu nome novamente: ")
		leia(nome)

		escreva("Digite sua idade: ")
		leia(idade)

		escreva("Olá, ", nome, ", sua idade é ", idade, "\n\n")


		// -----------------------------
		// EXERCÍCIO 4
		// Cálculo das áreas das figuras
		// -----------------------------

		real base, altura
		real lado
		real diagonal_maior, diagonal_menor
		real base_maior, base_menor
		real raio
		real area

		escreva("EXERCÍCIO 4 - Cálculo das Áreas\n\n")


		// RETÂNGULO
		escreva("Área do Retângulo\n")
		escreva("Digite a base: ")
		leia(base)

		escreva("Digite a altura: ")
		leia(altura)

		area = base * altura
		escreva("Área do retângulo: ", area, "\n\n")


		// QUADRADO
		escreva("Área do Quadrado\n")
		escreva("Digite o lado: ")
		leia(lado)

		area = lado * lado
		escreva("Área do quadrado: ", area, "\n\n")


		// LOSANGO
		escreva("Área do Losango\n")
		escreva("Digite a diagonal maior: ")
		leia(diagonal_maior)

		escreva("Digite a diagonal menor: ")
		leia(diagonal_menor)

		area = (diagonal_maior * diagonal_menor) / 2
		escreva("Área do losango: ", area, "\n\n")


		// TRAPÉZIO
		escreva("Área do Trapézio\n")
		escreva("Digite a base maior: ")
		leia(base_maior)

		escreva("Digite a base menor: ")
		leia(base_menor)

		escreva("Digite a altura: ")
		leia(altura)

		area = ((base_maior + base_menor) * altura) / 2
		escreva("Área do trapézio: ", area, "\n\n")


		// PARALELOGRAMO
		escreva("Área do Paralelogramo\n")
		escreva("Digite a base: ")
		leia(base)

		escreva("Digite a altura: ")
		leia(altura)

		area = base * altura
		escreva("Área do paralelogramo: ", area, "\n\n")


		// TRIÂNGULO
		escreva("Área do Triângulo\n")
		escreva("Digite a base: ")
		leia(base)

		escreva("Digite a altura: ")
		leia(altura)

		area = (base * altura) / 2
		escreva("Área do triângulo: ", area, "\n\n")


		// CÍRCULO
		escreva("Área do Círculo\n")
		escreva("Digite o raio: ")
		leia(raio)

		area = 3.14 * (raio * raio)
		escreva("Área do círculo: ", area, "\n\n")

	}
}
