package Heranca

     /*Crie uma hierarquia de classes conforme abaixo
     com os seguintes atributos e comportamentos (observe a tabela)
     , utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum
      a todos os animais fique na classe Animal: */

     import ExercicioAnimal.interfacesExc.Cachorro
       import ExerciciAnimal.interfacesExc.Cavalo

    fun main(){


    val cachorro = Cachorro("Choppy", 2, "Caramelo")
    val cavalo = Cavalo("Sortudo", 10)
    val preguica = Preguica("Sr Preguica", 5)


    cachorro.emitirSom()
    cavalo.emitirSom()
    preguica.emitirSom()
    println(cachorro)


}