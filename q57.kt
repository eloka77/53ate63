fun main() {
    print("\ndigite pr1: ")
    val pr1 = readln().toDouble()
    print("\ndigite pr2: ")
    val pr2 = readln().toDouble()
    val mf = (pr1 + pr2) / 2
    println("\nmedia truncada = ${((mf - 0.5) + 0.001).toInt()}")
    println("media arredondada = ${(mf + 0.001).toInt()}\n")
}