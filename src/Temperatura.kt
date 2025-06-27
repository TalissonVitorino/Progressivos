fun main() {
    // Solicita a entrada do usuário
    print("Digite a temperatura em graus celsius: ")
    val celsius = readln().toDouble()
    
    // Calcula a conversão para Fahrenheit
    val fahrenheit = celsius * 1.8 + 32
    println("A temperatura convertida em fahrenheit é: $fahrenheit")
    
    // Calcula a conversão para Kelvin
    // extra
    val kelvin = celsius + 273.15
    println("A temperatura convertida em kelvin é: $kelvin")
}