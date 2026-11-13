fun main() {
    print("\nhoras trabalhadas: ")
    val na = readln().toInt()
    print("\nvalor da hora-aula: ")
    val vha = readln().toDouble()
    print("\npercentual de desconto: ")
    val pd = readln().toDouble()
    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td
    println("\nsalario liquido: $sl\n")
}