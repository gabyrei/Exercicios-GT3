package Heranca

import Exercicio.Animal

class Cachorro(override var nome: String, override var idade: Int) : Animal {

    override fun emitirSom() {
        println("AU!")
    }

    override fun deslocamento() {
        println("Correr como um cachorro")
    }
    }
}







