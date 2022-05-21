mport kotlin.contracts.contract

fun main () {

    /*    Dados do Estoque
         dados p/ Adicionar
         dados p/ remover
         dados p/ atualizar */

    val itens = mutableListOf<String>()
    while (true) {

        print("Ola ,bem vindo ao estoque escolha uma opição ")
        println("dgite 1 Adicionar iten ")
        println("digite 2  remover iten ,")
        println("digite 3- Atualizar itens")
        println(" escolha opição saída ")

        val opção = readLine().toInt()

        ->1 {
            println("inserir iten")
            println("Adicionar iten")
            val intens = readLine()

        }

        -> 2 {
            println("Escolha o inten para remover")
            println("remover iten")
            val itens = readLine()

        }

        -> 3 {
            println("Atulizar itens ")
            println("Atualizando itens")
            val itens = readLine()

            itens.forEach {
                print(it)
            }
            if (itens.contains(itens)) {
                val index = itens.indexOf(itens)

                print("Digite o novo iten")


                itens[index] = itens
                val valor = readLine()

                println("Atualizado com sucesso")

            }

        }
    }
}else{
    println("Nome $= não identificado ")

    -> 4 {
        print("numero de intns é: ${.estoque.size)")
                println("estoque")





        }




    }







}