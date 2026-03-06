// Exercícios de repetição
// Autor: Gabryel

fun main() {

    // --------------------------------------------------
    // Declaração de variáveis
    // --------------------------------------------------

    var i: Int
    var n: Int
    var valor1: Int
    var valor2: Int
    var resultado: Double
    var soma: Int
    var contador: Int
    var media: Double
    var nota: Int
    var aprovados = 0
    var resposta: String
    var dentro = 0
    var fora = 0


    // --------------------------------------------------
    // Exercício 1 - Bomba relógio
    // --------------------------------------------------

    for (i in 30 downTo 0) {
        println(i)
    }

    println("EXPLOSÃO\n")


    // --------------------------------------------------
    // Exercício 2 - Divisão com validação
    // --------------------------------------------------

    print("Digite o primeiro valor: ")
    valor1 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    valor2 = readLine()!!.toInt()

    while (valor2 <= 0) {
        print("Valor inválido. Digite novamente: ")
        valor2 = readLine()!!.toInt()
    }

    resultado = valor1.toDouble() / valor2

    println("Resultado da divisao: $resultado\n")


    // --------------------------------------------------
    // Exercício 3 - Números de 10 a 1
    // --------------------------------------------------

    for (i in 10 downTo 1) {
        print("$i ")
    }

    println("\n")


    // --------------------------------------------------
    // Exercício 4 - Média entre 15 e 100
    // --------------------------------------------------

    soma = 0
    contador = 0

    for (i in 15..100) {
        soma += i
        contador++
    }

    media = soma.toDouble() / contador

    println("Media: $media\n")


    // --------------------------------------------------
    // Exercício 5 - Média entre dois números
    // --------------------------------------------------

    print("Digite o primeiro numero: ")
    valor1 = readLine()!!.toInt()

    print("Digite o segundo numero: ")
    valor2 = readLine()!!.toInt()

    soma = 0
    contador = 0

    for (i in valor1..valor2) {
        soma += i
        contador++
    }

    media = soma.toDouble() / contador

    println("Media: $media\n")


    // --------------------------------------------------
    // Exercício 6 - Média de alunos
    // --------------------------------------------------

    resposta = "S"

    while (resposta == "S" || resposta == "s") {

        var nota1: Double
        var nota2: Double

        print("Digite a primeira nota: ")
        nota1 = readLine()!!.toDouble()

        print("Digite a segunda nota: ")
        nota2 = readLine()!!.toDouble()

        media = (nota1 + nota2) / 2

        println("Media: $media")

        if (media >= 9.5) {
            aprovados++
        }

        print("Calcular a media de outro aluno? (S/N): ")
        resposta = readLine()!!
    }

    println("Quantidade de aprovados: $aprovados\n")


    // --------------------------------------------------
    // Exercício 7 - Média de 6 notas válidas
    // --------------------------------------------------

    soma = 0

    for (i in 1..6) {

        print("Digite a nota $i: ")
        nota = readLine()!!.toInt()

        while (nota < 0 || nota > 10) {
            print("Nota inválida. Digite novamente: ")
            nota = readLine()!!.toInt()
        }

        soma += nota
    }

    media = soma.toDouble() / 6

    println("Media final: $media\n")


    // --------------------------------------------------
    // Exercício 8 - Números de 1 até N
    // --------------------------------------------------

    print("Digite um valor N: ")
    n = readLine()!!.toInt()

    for (i in 1..n) {
        print("$i ")
    }

    println("\n")


    // --------------------------------------------------
    // Exercício 9 - 10 números maiores que 100
    // --------------------------------------------------

    for (i in 101..110) {
        print("$i ")
    }

    println("\n")


    // --------------------------------------------------
    // Exercício 10 - Valores entre 24 e 42
    // --------------------------------------------------

    var valor: Int

    for (i in 1..10) {

        print("Digite um valor: ")
        valor = readLine()!!.toInt()

        if (valor >= 24 && valor <= 42) {
            dentro++
        } else {
            fora++
        }
    }

    println("Dentro do intervalo: $dentro")
    println("Fora do intervalo: $fora\n")


    // --------------------------------------------------
    // Exercício 11 - Tabuada de 1 até N
    // --------------------------------------------------

    print("Digite o valor de N: ")
    n = readLine()!!.toInt()

    for (i in 1..n) {

        println("\nTabuada do $i")

        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
    }

}
