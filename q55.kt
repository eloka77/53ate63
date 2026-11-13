fun main() {
    print("\nmedida da diagonal maior: ")
    val diagmaior = readln().toDouble()
    print("\nmedida da diagonal menor: ")
    val diagmenor = readln().toDouble()
    val area = (diagmaior * diagmenor) / 2
    println("\narea = $area\n")
}