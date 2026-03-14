data class Registro(val nome: String, val endereco: String, val telefone: String, val ignoreCase: Boolean)

fun main() {

    val agenda = mutableListOf<Registro>()      //Lista de agenda
    var opcao = 0                               //Opção começa em 0

    while (opcao != 5) {
        println("\n--- Bem vindo ao de cadastro ---")
        println("1 - Cadastrar usuários (10 registros)")
        println("2 - Pesquisar usuário por nome")                   //Menu de escolhas para o usuário
        println("3 - Apresentar todos os usuários")
        println("4 - Sair")
        print("Escolha uma opção: ")
        
        opcao = readLine()?.toIntOrNull() ?: 0


        //Case para realização de tarefa
        when (opcao) {
            1 -> {
                if (agenda.size >= 10) {
                    println("A agenda já possui 10 registros.")
                } else {
                    while (agenda.size < 10) {
                        println("\nCadastro ${agenda.size + 1} de 10:")
                        cadastrarUsuarios(agenda)
                    }
                    println("\nCadastro concluído.")
                }
            }
            2 -> {
                if (agenda.isEmpty()) {
                    println("Nenhum registro cadastrado.")
                } else {
                    buscarUsuario(agenda)
                }
            }
            3 -> {
                        buscarTodos(agenda)
            }
            4 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida.")
        }}}

//Funcionalide de cadastrar o usuário
fun cadastrarUsuarios(agenda: MutableList<Registro>) {
    println("--Cadastre aqui--")
    print("Digite seu nome: ")
    val nome = readLine() ?: ""
    print("Endereço: ")
    val endereco = readLine() ?: ""
    print("Telefone: ")
    val telefone = readLine() ?: ""

    if (nome.isNotEmpty() && endereco.isNotEmpty() && telefone.isNotEmpty()) {
        agenda.add(Registro(nome, endereco, telefone, ignoreCase = true))
    } else {
        println("Todos os campos são obrigatórios. Tente este registro novamente.")
        cadastrarUsuarios(agenda)
    }

}

//Funcionalidade buscar usuário pelo nome
 fun buscarUsuario(agenda: MutableList<Registro>){

    var encontrado = false

    println("Digite o nome do usuário que deseja buscar:")
    var nomeBusca = readLine() ?: ""


    for(reg in agenda){
        if (reg.nome.equals(nomeBusca, ignoreCase = true)){
            encontrado = true
            println("Usuário encontrado: ${reg.nome}, ${reg.endereco}, ${reg.telefone}")
        }
    }

    if (encontrado != true){
        println("Usuario não encontrado!")
    }

}

//Funcionalidade de buscar todos usuários
fun buscarTodos(agenda: MutableList<Registro>){
    for(i in agenda){
        println("Nome: ${i.nome}, Endereço: ${i.endereco}, ${i.telefone}")
    }
}
