fun main() {
    println("Digite a primeira nota: ")
    val nota1 = readLine()!!.toFloat()
    println("Digite a segunda nota: ")
    val nota2 = readLine()!!.toFloat()
    println("Digite a terceira nota: ")
    val nota3 = readLine()!!.toFloat()
    println("Digite a quarta nota: ")
    val nota4 = readLine()!!.toFloat()
    val soma = (nota1 + nota2 + nota3 + nota4)
    val media = soma / 4
    println("A média das notas é: $media")
}