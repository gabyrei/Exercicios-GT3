fun main() {

    // calculando os dados
    println("entre com primerio numero:")
    val num1 = readLine()!!.toInt()
    println("entre com segundo numero :")
    val num2 = readLine()!!.toInt()
    println("entre com o terceiro numero")
    val num3 = readLine()!!.toInt()

    // dando ao saida - ESTURA DA SELEÇÃO
    if (num1 > num2 && num1 > num3) {
        println("o numero $num1 é maior  ")
    } else if (num2 > num3) {
        println("o numero $num2 é maior")
    } else {
        println("o numero $num3 é maior")
    }
}
