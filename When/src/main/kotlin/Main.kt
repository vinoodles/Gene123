fun main(args: Array<String>) {

    var mes: Int

    println("Informe o numero do mês que deseja verificar: ")
    mes = readLine()!!.toInt()

    when(mes)
    {
        1 -> println("O mês é de Janeiro")
        2 -> println("O mês é de Fevereiro")
        3 -> println("O mês é de Março")
        4 -> println("O mês é de Abril")
        5 -> println("O mês é de Maio")
        6 -> println("O mês é de Junho")
        7 -> println("O mês é de Julho")
        8 -> println("O mês é de Agosto")
        9 -> println("O mês é de Setembro")
        10 -> println("O mês é de Outubro")
        11-> println("O mês é de Novembro")
        12 -> println("O mês é de Dezembro")
        else -> println("O mês informado não existe")

    }

}