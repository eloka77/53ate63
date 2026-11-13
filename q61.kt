import kotlin.math.pow

fun main() {
    print("\nEntre com o 1o termo: ")
    val termo = readln().toInt()
    print("\nEntre com a razao: ")
    val razao = readln().toInt()
    val quinto = termo * razao.toDouble().pow(4).toInt()
    println("\nO 5o termo desta P.G. e: $quinto\n")
}