import kotlin.math.PI

fun main (){

    //Entrada de dados
    println("imforme o diametro:")
    var diamtro = readLine()!!.toDouble()

    //processamento
    val raio = diamtro/2
    val perimetro = 2* PI * raio
    var area = PI *raio*raio

    //saida
    println("Perimetro:$perimetro ")
    println("area : $area")



}
