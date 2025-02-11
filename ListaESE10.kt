fun main() {
    println("Temperatura em Celsius: ")
    val C = readLine()!!.toFloat()
    
    val F =  C * 1.8 + 32
    println("Temperatura em Fahrenheit: $F")
}