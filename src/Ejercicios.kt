// Ejercicios.kt

// === RETO 1 ===
// Control de Gastos Diarios
fun reto1() {
    val gastos = arrayOf(10.5, 20.0, 15.0, 8.5, 12.0, 18.0, 22.0, 9.0, 11.0, 13.0, 14.0, 16.0, 17.0, 19.0, 21.0)
    var total = 0.0
    var max = gastos[0]
    var min = gastos[0]
    for (g in gastos) {
        total += g
        if (g > max) max = g
        if (g < min) min = g
    }
    val promedio = total / gastos.size
    println("=== RETO 1 ===")
    println("Gastos: ${gastos.joinToString()}")
    println("Total: $total, Promedio: $promedio, Máximo: $max, Mínimo: $min")
    println()
}

// === RETO 2 ===
// Filtro de Empleados Senior
fun reto2() {
    val empleados = listOf("Ana" to 25, "Luis" to 35, "Marta" to 40, "Javi" to 28, "Carmen" to 45)
    val seniors = mutableListOf<String>()
    for ((nombre, edad) in empleados) {
        if (edad > 30) seniors.add(nombre.uppercase())
    }
    println("=== RETO 2 ===")
    println("Empleados: $empleados")
    println("Senior (>30 años): $seniors")
    println()
}