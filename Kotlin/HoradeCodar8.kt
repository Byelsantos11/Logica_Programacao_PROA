
fun main() {
    println("Olá seja bem vindo no Virtual Pet")
    println("Definir um nome para seu ´pet:")                       //Menu inicial de Boas Vindas!
    var nomePet = readln()
    var pet = VirtualPet(nomePet)
    println("Seu pet: ${pet.nome}, nasceu!")

            while (true) {

                println("\nEscolha uma ação para seu pet:")
                println("1- Alimentar")
                println("2- Brincar")                                           //Menu escolha do usuario
                println("3- Descansar")
                println("4- Ver condição Pet")
                println("5- Sair")

                val escolha = readln().toInt()

                when (escolha) {
                    1 -> pet.alimentar()
                    2 -> pet.brincar()
                    3 -> pet.descansar()
                    4 -> pet.verificarStatus()
                    5 -> {
                        println("Saindo do jogo...")
                        break
                    }
                    else -> println("Opção inválida")
                }

                pet.passarTempo()

                if (pet.perdeuGame()) {
                    println("Você perdeu o jogo!")              //Verificação da perda do game
                    pet.verificarStatus()
                    break
                }
            }
        }

class VirtualPet(val nome: String) {
    var nivelDeFome = 50
    var nivelFelicidade = 50
    var cansado = 50
    var idade = 0

    //Função de alimentar ok
    fun alimentar() {
        nivelDeFome -= 10
        nivelFelicidade += 10
        println("$nome foi alimentado. O nível de fome diminuiu. Nivel de fome: $nivelDeFome")
    }

    // Função brincar ok
    fun brincar() {
        nivelFelicidade += 10
        cansado += 10
        println("$nome está brincando e se sentindo mais feliz.")
        println("$nome cansou :$cansado")
        println("Felicidade: $nivelFelicidade")
    }

    //Função descansar ok
    fun descansar() {
        cansado -= 15
        println("$nome descansou e está menos cansado. Cansaço: $cansado")
    }

    //Função verificar ok
    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nivel de cansaço: $cansado")
    }

    //Função passar tempo ok
    fun passarTempo() {
        nivelDeFome += 5
        println("$nome está ficando mais faminto com o passar do tempo.")
    }

    //Função perdeu game ok
    fun perdeuGame(): Boolean {
        return nivelDeFome >= 100 || cansado >= 100 || nivelFelicidade <= 0
    }
}



