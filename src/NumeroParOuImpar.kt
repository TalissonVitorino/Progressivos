// tenho que pedir o valor a ser verificado se e par ou não
// Depois fazer calculo de mod
// depois imprimir se e par ou impar

fun main() {
    // pego o numero a ser verificado coloco na variável número
    print("Digite o número a ser verificado: ")
    val numero = readln().toInt()
    // Faço a Verificação se o resto da divisão é 0
    if(numero % 2 == 0){
        // Se fo 0 é Par
        print("O número é par: $numero")
    }else{
        // se não é impar
        print("O numero é impar: $numero")
    }
}

