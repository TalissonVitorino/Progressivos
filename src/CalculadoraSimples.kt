// pegar os números do teclado
// pegar a operação desejada
// criar variável Resultado
// fazer o cálculo
// fazer verificação na divisão com zero e tratar esse erro
// mostrar o resultado

fun main() {
    // pegar os números do teclado
    println("Digite o primeiro número: ")
    val numero1 = readln().toDouble()
    println("Digite o segundo numero: ")
    val numero2 = readln().toDouble()

    // pegar a operação desejada
    print("Digite o operador (+, -, *, /): ")
    val op = readln().trim()

    // criar variável Resultado
    val resultado: Double
    // fazer o cálculo
    if (op == "+") resultado = numero1 + numero2
    else if (op == "-") resultado = numero1 - numero2
    else if (op == "*") resultado = numero1 * numero2
    else if (op == "/") {
// fazer verificação na divisão com zero e tratar esse erro
        resultado = if (numero2 == 0.0) {
            println("Erro: divisão por zero.")
            return
        } else {
            numero1 / numero2
        }
    } else {
        println("Operador inválido.")
// mostrar o resultado tratativa de erro básica

        resultado = (return)
    }
// mostrar o resultado
    println("Resultado: $resultado")
}