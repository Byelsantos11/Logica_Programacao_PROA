data class Aluno(val nome: String, val nota: Double, val aprovacao: Boolean)

fun main(){

    val alunos = mutableListOf<Aluno>()     //Variavel lista de alunos
    var escolha = 0                         //Escolha começa em 0

    while (escolha != 3) {
        println("\n---Menu Escola---")
        println("1- Adicionar aluno")
        println("2- Buscar aluno")              //Menu de escolhas para o usuário
        println("3- Sair")
        print("Escolha uma opção: ")

        escolha = readLine()?.toIntOrNull() ?: 0


        //Case para realização de tarefa
        when(escolha){
            1 -> {
                if (alunos.size >= 20) {
                    println("A lista de alunos já está cheia (limite de 20).")
                } else {
                    cadastrarAluno(alunos)
                }
            }
            2 -> {
                if (alunos.isEmpty()) {
                    println("Nenhum aluno cadastrado.")
                } else {
                    buscarAluno(alunos)
                }
            }
            3 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida.")
        }
    }
}

//Funcionalidade de cadastrar aluno e verificar sua nota
fun cadastrarAluno(alunos: MutableList<Aluno>) {
    println("\nCadastro do aluno ${alunos.size + 1}:")

    println("Digite o nome do aluno:")
    val nome = readLine() ?: ""

    println("Digite a média do aluno:")
    val media = readLine()?.toDoubleOrNull()

    if (nome.isNotEmpty() && media != null){
        val aprovado = media >= 6
        alunos.add(Aluno(nome, media, aprovado))
        println("Aluno cadastrado com sucesso!")
    } else {
        println("Preencha todos os campos corretamente!")
        cadastrarAluno(alunos)
    }
}

//Funcionalidade para buscar aluno pelo nome
fun buscarAluno(alunos: MutableList<Aluno>) {

    var encontrado = false

    println("Digite o nome do aluno que deseja buscar:")
    val nomeBusca = readLine() ?: ""

    for (alu in alunos) {
        if (alu.nome.equals(nomeBusca, ignoreCase = true)) {

            val status = if (alu.aprovacao) "Aprovado" else "Reprovado"

            println("\nAluno encontrado:")
            println("Nome: ${alu.nome}")
            println("Nota: ${alu.nota}")
            println("Status: $status")

            encontrado = true
        }
    }

    if (!encontrado) {
        println("Aluno não encontrado!")
    }
}
