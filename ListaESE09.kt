fun main() {
    println("Temperatura em Fahrenheit: ")
    val F = readLine()!!.toFloat()
    
    val C =  5 * ((F-32) / 9)
    println("Temperatura em Celsius: $C")
}
