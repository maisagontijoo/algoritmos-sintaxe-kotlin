fun main() {
    println("Medida em metros: ")
    val metros = readLine()!!.toFloat()
    
    val centimetros = metros * 100
    println("A medida em centímetros é: $centimetros")
}