// Programa com vários exercícios de lógica
// Autor: Gabryel

fun main() {

    // -----------------------------
    // EXERCÍCIO 1
    // Criar uma variável chamada nome_do_carro
    // -----------------------------

    val nome_do_carro = "Fusca"

    println("Exercício 1")
    println("O nome do carro é: $nome_do_carro\n")


    // -----------------------------
    // EXERCÍCIO 2
    // Usuário informa o nome
    // -----------------------------

    println("Exercício 2")
    print("Digite seu nome: ")
    val nome = readLine()

    println("Olá, $nome\n")


    // -----------------------------
    // EXERCÍCIO 3
    // Usuário informa nome e idade
    // -----------------------------

    println("Exercício 3")
    print("Digite seu nome novamente: ")
    val nome2 = readLine()

    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()

    println("Olá, $nome2, sua idade é $idade\n")


    // -----------------------------
    // EXERCÍCIO 4
    // Cálculo das áreas das figuras
    // -----------------------------

    var base: Double
    var altura: Double
    var lado: Double
    var diagonalMaior: Double
    var diagonalMenor: Double
    var baseMaior: Double
    var baseMenor: Double
    var raio: Double
    var area: Double

    println("EXERCÍCIO 4 - Cálculo das Áreas\n")


    // RETÂNGULO
    println("Área do Retângulo")
    print("Digite a base: ")
    base = readLine()!!.toDouble()

    print("Digite a altura: ")
    altura = readLine()!!.toDouble()

    area = base * altura
    println("Área do retângulo: $area\n")


    // QUADRADO
    println("Área do Quadrado")
    print("Digite o lado: ")
    lado = readLine()!!.toDouble()

    area = lado * lado
    println("Área do quadrado: $area\n")


    // LOSANGO
    println("Área do Losango")
    print("Digite a diagonal maior: ")
    diagonalMaior = readLine()!!.toDouble()

    print("Digite a diagonal menor: ")
    diagonalMenor = readLine()!!.toDouble()

    area = (diagonalMaior * diagonalMenor) / 2
    println("Área do losango: $area\n")


    // TRAPÉZIO
    println("Área do Trapézio")
    print("Digite a base maior: ")
    baseMaior = readLine()!!.toDouble()

    print("Digite a base menor: ")
    baseMenor = readLine()!!.toDouble()

    print("Digite a altura: ")
    altura = readLine()!!.toDouble()

    area = ((baseMaior + baseMenor) * altura) / 2
    println("Área do trapézio: $area\n")


    // PARALELOGRAMO
    println("Área do Paralelogramo")
    print("Digite a base: ")
    base = readLine()!!.toDouble()

    print("Digite a altura: ")
    altura = readLine()!!.toDouble()

    area = base * altura
    println("Área do paralelogramo: $area\n")


    // TRIÂNGULO
    println("Área do Triângulo")
    print("Digite a base: ")
    base = readLine()!!.toDouble()

    print("Digite a altura: ")
    altura = readLine()!!.toDouble()

    area = (base * altura) / 2
    println("Área do triângulo: $area\n")


    // CÍRCULO
    println("Área do Círculo")
    print("Digite o raio: ")
    raio = readLine()!!.toDouble()

    area = 3.14 * (raio * raio)
    println("Área do círculo: $area\n")
}
