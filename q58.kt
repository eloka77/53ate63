import kotlin.math.log

fun main() {
    print("\nEntrar com 1 valor: ")
    val xnum1 = readln().toDouble()
    print("\nEntrar com 2 valor: ")
    val xnum2 = readln().toDouble()
    print("\nEntrar com 3 valor: ")
    val xnum3 = readln().toDouble()
    val x = xnum1 + (xnum2 / (xnum3 + xnum1)) + 2 * (xnum1 - xnum2) + (log(64.0, 2.0))
    println("\nX = $x\n")
}