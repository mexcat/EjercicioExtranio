package cl.gencina.ejercicioextrao

fun main() {
    var numeroA = 10
    val numeroB = 33
    val numeroC = 66

    var suma = numeroA + numeroB + numeroC
    println(suma)

    numeroA = 55
    suma = numeroA + numeroB + numeroC
    println(suma)

    val prom = suma/3f

    println(prom)
}