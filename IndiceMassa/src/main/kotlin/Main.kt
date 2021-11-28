import kotlin.math.pow

fun main(args: Array<String>) {

    var peso: Double
    var altura: Double
    var imc: Double

    println("Informe seu peso: ")
    peso = readLine()!!.toDouble()

    println("Digite sua Altura: ")
    altura = readLine()!!.toDouble()

    imc = peso / altura.pow(2)

    if (imc < 18.5)
    {
        println("Desnutrição!")
    }
    else if(imc >= 18.5 && imc < 24.9)
    {
        println("Peso regular")
    }
    else if(imc >= 25 && imc < 29.9)
    {
        println("Acima do peso")
    }
    else if(imc >= 30 && imc < 39)
    {
        println("Você está obeso!")
    }
    else
    {
        println("Você está com obesidade mórbida")
    }

}