fun main(args: Array<String>) {

    var idade: Int
    var preco: Double = 18.0
    var quantidadeIngresso: Int

    print("Informe sua idade: ")
    idade = readLine()!!.toInt()

    if(idade <= 5) {
        println("Abaixo de 5 anos o desconto é de 60% no ingresso, " +
                "ficando no valor de R$${ "%.2f".format(preco - ((preco * 60) / 100))}\n")
    } else if (idade >= 60) {
        println("Acima de 60 anos o desconto é de 55%, ficando no valor de " +
                " R$ ${ "%.2f".format(preco - ((preco * 55) / 100))}\n")
    }

    print("Quantos ingressos deseja comprar? ")
    quantidadeIngresso = readLine()!!.toInt()


    if(quantidadeIngresso >= 2) {
        println("Ao comprar mais de um ingresso você terá um desconto de 30%, " +
                        "ficando R$ ${ "%.2f".format(preco - ((preco * 30) / 100))}")
    } else {
        println("O preço ficará R$18,00 por ingresso")
    }

}
