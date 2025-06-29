// tenho que pedir tres número e verificar quem é o maior deles
// depois imprimir na tela o maior número

fun main() {
    println("Digite o primeiro número: ")
    val numero1 = readln().toInt()

    println("Digite o segundo número: ")
    val numero2 = readln().toInt()

    println("Digite o terceiro número: ")
    val numero3 = readln().toInt()

    // Jeito mais fácil de entender usando o &&quase sempre
// que precisar combinar condições booleanas em if, while.
    if (numero1 > numero2 && numero1 > numero3) {
        println(numero1)
    } else if (numero2 > numero1 && numero2 > numero3) {
        println(numero2)
    } else {
        println(numero3)
    }
}
// Jeito mais deficíl entender
//    if (numero1 > numero2 ) {
//        if(numero1 > numero3){
//            println(numero1)
//        }else{
//            if (numero2 > numero3){
//                println(numero2)
//            }else{
//                println(numero3)
//            }
//        }
//    }else{
//    }




