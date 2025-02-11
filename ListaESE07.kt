fun main() {
    println("Medida lado do quadrado: ")
    val lado = readLine()!!.toFloat()
    
    val area = lado * lado
    val dobroarea = area * 2
    println("O dobro da área do quadrado é: $dobroarea")
}