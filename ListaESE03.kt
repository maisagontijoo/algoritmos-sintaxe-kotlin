fun main() {
    println("Digite um número: ")
    val num1 = readLine()!!.toInt()
    println("Digite outro número: ")
    val num2 = readLine()!!.toInt()
    val soma = (num1 + num2)
    println("$num1 + $num2 = $soma")
}