fun main(args: Array<String>) {


    var resposta: String = "sim"
    var nome: String = ""
    var menu: Int = 0

    var lista = mutableListOf("Chefe", "Chegado", "Grande", "Embaixador")

    while (resposta == "sim")
    {
        println("** Seja Bem Vindo **")
        println("Escolha alguma das opções abaixo\n")

        println(" 1 - Adicionar um novo convidado a Lista \n" +
                " 2 - Remover um convidado da Lista \n"  +
                " 3 - Listar os convidados \n")

        menu = readLine()!!.toInt()

        when(menu) {
            1 ->    if( 0 == 0 )
            {
                println("Informe o nome que deseja adicionar a Lista: ")
                nome = readLine()!!
                lista.add(nome)
            }

            2 ->    if ( 0 == 0 )
            {
                println("Informe o nome que deseja remover da Lista: ")
                nome = readLine()!!
                if(lista.contains(nome))
                {
                    lista.remove(nome)
                }
                else
                {
                    println("O convidado informado não existe")
                }
            }

            3 ->    if ( 0 == 0 )
            {
                println("Está é a lista de convidados: ")
                println(lista)
            }
            else -> println("Numero digitado invalido")
        }

        println("Deseja realizar mais alguma mudança? (sim/não)")
        resposta = readLine()!!
        println("Está é a lista de convidados: ")
        println(lista)

    }
}