fun main(args: Array<String>) {

    var media1: Double
    var media2: Double
    var media3: Double
    var media4: Double
    var mediaTotal: Double

    println("Por favor, informe a sua nota do primeiro bimestre")
    media1 = readLine()!!.toDouble()

    println("Por favor, informe a sua nota do segundo bimestre")
    media2 = readLine()!!.toDouble()

    println("Por favor, informe a sua nota do terceiro bimestre")
    media3 = readLine()!!.toDouble()

    println("Por favor, informe a sua nota do quarto bimestre")
    media4 = readLine()!!.toDouble()

    mediaTotal = (media1 + media2 + media3 + media4) / 4

    if (mediaTotal < 4)
    {
        println("Sua media está abaixo de 4, reprovado!")
    }
        else if (mediaTotal >= 4 && mediaTotal <= 5)
        {
            println("Você está de recuperação!")
        }
            else if (mediaTotal > 5 && mediaTotal <= 8)
            {
                println("Você teve um desempenho regular")
            }
                else if (mediaTotal > 8 && mediaTotal <= 10)
                {
                    println("Excelente nota!")
                }
                    else
                    {
                        println("Nota inválida!")
                    }
}