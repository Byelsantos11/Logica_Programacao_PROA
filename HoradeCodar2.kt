// Exercícios de lógica convertidos para Kotlin
// Autor: Gabryel

fun main() {

    // --------------------------------------------------
    // Declaração de variáveis
    // --------------------------------------------------

    var n1: Int
    var n2: Int
    var n3: Int
    var n4: Int
    var n5: Int
    var n6: Int
    var numero: Int
    var soma: Double
    var media: Double
    var anoNascimento: Int
    var idade: Int
    var anoAtual: Int
    var altura: Double
    var pesoIdeal: Double
    var genero: Int
    var operacao: Int


    // --------------------------------------------------
    // Exercício 1 - Maior entre dois números
    // --------------------------------------------------

    print("Digite o primeiro numero: ")
    n1 = readLine()!!.toInt()

    print("Digite o segundo numero: ")
    n2 = readLine()!!.toInt()

    if (n1 > n2) {
        println("\nMaior numero: $n1")
    } else {
        println("\nMaior numero: $n2")
    }

    println()


    // --------------------------------------------------
    // Exercício 2 - Positivo, negativo ou zero
    // --------------------------------------------------

    print("Digite um numero: ")
    numero = readLine()!!.toInt()

    if (numero > 0) {
        println("Numero positivo")
    } else if (numero < 0) {
        println("Numero negativo")
    } else {
        println("Numero é zero")
    }

    println()


    // --------------------------------------------------
    // Exercício 3 - Maior entre três números
    // --------------------------------------------------

    n1 = readLine()!!.toInt()
    n2 = readLine()!!.toInt()
    n3 = readLine()!!.toInt()

    if (n1 > n2 && n1 > n3) {
        println("Maior: $n1")
    } else if (n2 > n1 && n2 > n3) {
        println("Maior: $n2")
    } else {
        println("Maior: $n3")
    }

    println()


    // --------------------------------------------------
    // Exercício 4 - Soma dos dois maiores
    // --------------------------------------------------

    n1 = readLine()!!.toInt()
    n2 = readLine()!!.toInt()
    n3 = readLine()!!.toInt()

    if (n1 < n2 && n1 < n3) {
        soma = (n2 + n3).toDouble()
    } else if (n2 < n1 && n2 < n3) {
        soma = (n1 + n3).toDouble()
    } else {
        soma = (n1 + n2).toDouble()
    }

    println("Soma dos dois maiores: $soma")

    println()


    // --------------------------------------------------
    // Exercício 5 - Média de seis números
    // --------------------------------------------------

    soma = 0.0

    n1 = readLine()!!.toInt()
    n2 = readLine()!!.toInt()
    n3 = readLine()!!.toInt()
    n4 = readLine()!!.toInt()
    n5 = readLine()!!.toInt()
    n6 = readLine()!!.toInt()

    soma = (n1 + n2 + n3 + n4 + n5 + n6).toDouble()
    media = soma / 6

    println("Media: $media")

    println()


    // --------------------------------------------------
    // Exercício 6 - Primeiro, último e maior
    // --------------------------------------------------

    n1 = readLine()!!.toInt()
    n2 = readLine()!!.toInt()
    n3 = readLine()!!.toInt()
    n4 = readLine()!!.toInt()

    println("Primeiro: $n1")
    println("Ultimo: $n4")

    if (n1 > n2 && n1 > n3 && n1 > n4) {
        println("Maior: $n1")
    } else if (n2 > n1 && n2 > n3 && n2 > n4) {
        println("Maior: $n2")
    } else if (n3 > n1 && n3 > n2 && n3 > n4) {
        println("Maior: $n3")
    } else {
        println("Maior: $n4")
    }

    println()


    // --------------------------------------------------
    // Exercício 7 - Somar números menores que 72
    // --------------------------------------------------

    soma = 0.0

    n1 = readLine()!!.toInt()
    n2 = readLine()!!.toInt()
    n3 = readLine()!!.toInt()
    n4 = readLine()!!.toInt()
    n5 = readLine()!!.toInt()
    n6 = readLine()!!.toInt()

    if (n1 < 72) soma += n1
    if (n2 < 72) soma += n2
    if (n3 < 72) soma += n3
    if (n4 < 72) soma += n4
    if (n5 < 72) soma += n5
    if (n6 < 72) soma += n6

    println("Soma: $soma")

    println()


    // --------------------------------------------------
    // Exercício 8 - Média entre 0 e 10
    // --------------------------------------------------

    n1 = readLine()!!.toInt()
    n2 = readLine()!!.toInt()
    n3 = readLine()!!.toInt()
    n4 = readLine()!!.toInt()

    if (n1 > 0 && n1 < 10 && n2 > 0 && n2 < 10 && n3 > 0 && n3 < 10 && n4 > 0 && n4 < 10) {

        media = (n1 + n2 + n3 + n4) / 4.0

        if (media > 5) {
            println("Voce passou no teste")
        } else {
            println("Tente novamente")
        }

    } else {
        println("Numeros invalidos")
    }

    println()


    // --------------------------------------------------
    // Exercício 9 - Pode votar
    // --------------------------------------------------

    anoAtual = 2026

    print("Digite o ano de nascimento: ")
    anoNascimento = readLine()!!.toInt()

    idade = anoAtual - anoNascimento

    if (idade >= 16) {
        println("Pode votar este ano")
    } else {
        println("Nao pode votar")
    }

    println()


    // --------------------------------------------------
    // Exercício 10 - Peso ideal
    // --------------------------------------------------

    print("Digite sua altura: ")
    altura = readLine()!!.toDouble()

    print("Genero (1 feminino / 2 masculino): ")
    genero = readLine()!!.toInt()

    if (genero == 1) {
        pesoIdeal = (62.1 * altura) - 44.7
    } else {
        pesoIdeal = (72.7 * altura) - 58
    }

    println("Peso ideal: $pesoIdeal")

    println()


    // --------------------------------------------------
    // Exercício 11 - Micro calculadora
    // --------------------------------------------------

    print("Digite primeiro numero: ")
    n1 = readLine()!!.toInt()

    print("Digite segundo numero: ")
    n2 = readLine()!!.toInt()

    print("Operacao (1 soma / 2 subtracao / 3 divisao / 4 multiplicacao): ")
    operacao = readLine()!!.toInt()

    if (operacao == 1) {
        println("Resultado: ${n1 + n2}")
    } else if (operacao == 2) {
        println("Resultado: ${n1 - n2}")
    } else if (operacao == 3) {
        println("Resultado: ${n1 / n2}")
    } else {
        println("Resultado: ${n1 * n2}")
    }
}
