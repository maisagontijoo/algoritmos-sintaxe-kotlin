fun main() {
    println("Quanto você ganha por hora: ")
    val ganho = readLine()!!.toFloat()
    println("Horas trabalhadas por mês: ")
    val horas = readLine()!!.toInt()
    
    val total = ganho * horas
    println("O total do seu salário é: R$ $total")
}