fun main() {

    /*caculando os dados
     10 - 14 - infantil
     15 - 17 -juvenil
     18 - 24 - adulto*/


    println("digite a sua idade :")
    var idade = readln().toInt()

    when (idade) {

        in 10..14 -> println("infantil")
        in 15..17 -> println("juvenil")
        in 18..24 -> println("adulto")

        else -> println ("sem categoria")}



}






















