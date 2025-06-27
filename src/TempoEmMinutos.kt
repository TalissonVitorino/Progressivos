fun main() {
    // pega o valor em dias
    print("Digite a quantidade de dias: ")
    val quantidade = readln().toDouble()
    // faz a conversao em minutos
    val minutos = quantidade * 1440
    // faz as conversao em horas
    val horas = quantidade * 24
    // Mostra a quantidade tanto em dias e o equivalente em minutos
    println("$quantidade dia(s) equivalem a $minutos minutos")
    // Mostra as horas em geral!
    println("Ou seja: $horas horas")
}
