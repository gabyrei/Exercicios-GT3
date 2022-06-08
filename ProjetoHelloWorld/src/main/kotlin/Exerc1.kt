fun main() {

       /*  1- Informar todos os números de 1000 a 1999 que quando divididos por 11
          obtemos resto = 5. (FOR)  */

    print("digite um numero para o calculo")
    val num= readln().toInt()

    for( i in 1000..1999){
        println("$num / $i = ${num* i } ")

    }
}

