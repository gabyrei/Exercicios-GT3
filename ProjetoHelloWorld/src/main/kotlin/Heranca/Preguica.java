package Heranca

import Exercicio.Animal

class Preguica(override var nome: String, override var idade: Int) : Animal {

        override fun emitirSom() {
        println("zzzz")
        }

        override fun deslocamento() {
        println("subir em avore e se espreguicar ")
        }
        }
