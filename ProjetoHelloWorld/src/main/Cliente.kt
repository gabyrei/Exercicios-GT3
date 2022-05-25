class Cliente {
}
     class clinte (private  var nome : String)

    private var endereço=""
    private var telefone = ""

   private val listCompras = mutableListof<String>()

    //Contrutores
   constructor(nome: String, endereço:String): this(nome){
       this.endereço = endereço
   }
       constructor(nome: String , endereço: String,  telefone: String)
       : this(nome, endereço) {
           this.telefone
       }

   fun addCompra(compra: String){
       if (compra != "") }
      listCompras.add(compra)
        println("\nitem adicionado")
  }else{
      println("\n o item não pode ser vzio")
  }
    fun removaCompra(compra: String){
        if (listCompras.contains(compras)) {
            listCompras.remove(compra)
            println("\n item removido")
        }else{
            println("\n item nao existe na lista ")
        }
            }

        fun listCompras(){
            println("\n Lista de Compras\n")
            listCompras.ForEach {
                println(it)
            }
            println()
        }


