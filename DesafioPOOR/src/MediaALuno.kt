import kotlin.system.exitProcess

class MediaAluno(soma:Double = 0.0, media:Double = 0.0) {
    private var notas:DoubleArray = DoubleArray(4)
    private var soma = soma
    private var media = media
    init {
        println("Seja bem vindo! Vamos calcular a sua média?")
        println("Escolha a melhor opção: ")
    }
    fun menu() {
        var opcao = 0
        do {
            println("Cálcular à Media digite 1");
            println("Sair do Programa 2");
            opcao = readln().toInt();
            if (opcao == 1) {
                mediaResultado();
            }
            else if (opcao == 2) {
                exitProcess(0)
            }
        }while (true)
    }
    fun mediaResultado() {
        for (i in notas.indices) {
            println("Digite a nota ${i + 1}")
            notas[i] = readln().toDouble()
            while (notas[i] < 0 || notas[i] > 10) {
                println("Digite uma nota entre 0 e 10")
                println("Digite a nota ${i + 1}")
                notas[i] = readln().toDouble()
            }
            soma += notas[i]
        }
        media = soma / notas.size
        println("A média é: %.2f: ".format(media))
    }
}