fun main() {
    print("Digite o preço original do produto: ")
    val valor = readln().toDouble()

    print("Digite o percentual de desconto: ")
    val desconto = readln().toDouble()

    val valorADescontar = valor * desconto / 100
    val valorComDeconto = valor - valorADescontar
    println("O valor a pagar é: $valorComDeconto ")


}