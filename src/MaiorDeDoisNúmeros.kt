// tenho que pedir dois número e verificar quem é o maior deles
// depois imprimir na tela o maior número

fun main() {
    println("Digite o primeiro numero: ")
    val numero1 = readln().toInt()
    println("Digite o segundo numero: ")
    val numero2 = readln().toInt()
    if (numero1 > numero2){
        println("o numero maior é o primero Digitado: $numero1")
    }else{
        println("O segundo numero é o maior: $numero2")
    }


}