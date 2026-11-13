import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("\nentre com a base: ")
    val a = readln().toDouble()
    print("\nentre com a altura: ")
    val b = readln().toDouble()
    print("\nentre com a profundidade: ")
    val c = readln().toDouble()
    val diagonal = sqrt(a.pow(2) + b.pow(2) + c.pow(2))
    println("\ndiagonal: $diagonal\n")
}