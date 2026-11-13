import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("\nEntrar com 1 cateto: ")
    val b = readln().toDouble()
    print("\nEntrar com 2 cateto: ")
    val c = readln().toDouble()
    val a = sqrt(b.pow(2) + c.pow(2))
    println("\nA hipotenusa e: $a\n")
}