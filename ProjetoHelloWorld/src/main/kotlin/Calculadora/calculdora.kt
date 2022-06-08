package Calculadora

fun main(args: Array<String>) {

   /* Adicionado as Operações*/

      println("1 Adição")
      println("2 Subrtração")
      println("3 Multi´licaçao")
      println("4 Divisão")
     println("5 potencia")
    println("6 Raiz quadrada")

    val  n1     val n2

    println("digite a opição ")
    val opeção = readln() . toInt()

    1- {
        println("Escolha a opição")
      val n1 = readln() .toInt()
        println("Escolha segunda opição ")
       val n2 = readln(). toInt()
        println("A soma entre $n1 e $n2 é ${Calculadora soma .(n1, n2)} ")
    }
      2- {
          println("Escolha a pição")
          val n1 = readln(). toInt()
          println("Esolha segunda opição")
          val n2= readln().toInt()
          println("A subritração é $n1 e $n2 é ${Calculadora subritraindo .(n1,n2)}")
    }

    3- {
        println("Esolha a opição ")
        val n1 = readln(). toInt()
        println('Escolha a segunda opição')
        val n2 = readln(). toInt()
        println("A mutiplicação é $n1 e $n2 e ${Calculadora dividindo.(n1,n2)}")



    }

    4- {
        println("Escolha a opição")
        val n1 = readln() .toInt()
        println("Escolha segunda opição ")
        val n2 = readln(). toInt()
        println("a divisão entre $n1 e $n2 é ${Calculadora potencia .(n1, n2)} ")}

    5- {
        println("Escolha a opição")
        val n1 = readln() .toInt()
        println("Escolha segunda opição ")
        val n2 = readln(). toInt()
        println("A potencia entre $n1 e $n2 é ${Calculadora potencia.(n1, n2)} ")

    }

    6-{
        println("Escolha a opição")
        val n1 = readln() .toInt()
        println("Escolha segunda opição ")
        val n2 = readln(). toInt()
        println("A raiz entre $n1 e $n2 é ${Calculadora raiz.(n1, n2)} ")}
}


