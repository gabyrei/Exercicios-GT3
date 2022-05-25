 /*Cria uma Classe Cliente, contendo os atributos encapsulados,
  um construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção,
   com os atributos:
     nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio,
       jogue uma exceção. Ao instanciar a classe cliente na função main(),
       não esquecer de colocar dentro de um bloco try catch.*/

       while (true) {

      print("Digitr o seu nome:")
      val nome = readln()

         try {
             val Fernanda = Clinte(nome)

             while (true) {

                 println("\n MENU \n")

                 println("1- Adicionar Compras")
                 println("2- Remover Compras")
                 println("3- Lista De Compras")
                 pritnln("4- Sair")

             }

             1 -> {
                 printl("Digite um produto para adicionar no carrinho ")
                 val compra= readln()
                 cliente.addCompra(compra)
             }

             2 -> {
                 println("Digite um iyem para remover")
                 val compras = readln()
                 cliente.removerCompra

             }

             3 -> {
                 cliente.listadecompras()
             }
             4 -> break

             else ->println("valor invalido")
         }

       }
