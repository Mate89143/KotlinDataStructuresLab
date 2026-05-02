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

// === RETO 3 ===
// Limpieza de Contactos Duplicados
fun reto3() {
    val telefonos = listOf("123", "456", "123", "789", "456", "000", "111", "222", "333", "444", "555", "666", "777", "888", "999", "123", "456", "789", "000", "111")
    val unicos = telefonos.toSet().toMutableList()
    for (i in 0 until unicos.size - 1) {
        for (j in i + 1 until unicos.size) {
            if (unicos[i] > unicos[j]) {
                val temp = unicos[i]
                unicos[i] = unicos[j]
                unicos[j] = temp
            }
        }
    }
    println("=== RETO 3 ===")
    println("Teléfonos originales (20): ${telefonos.joinToString()}")
    println("Únicos ordenados: $unicos")
    println()
}

// === RETO 4 ===
// Análisis de Carrito de Compras
fun reto4() {
    val carrito = listOf("manzana", "pera", "manzana", "pera", "pera", "uva", "manzana", "sandía")
    val unidades = mutableMapOf<String, Int>()
    for (producto in carrito) {
        unidades[producto] = unidades.getOrDefault(producto, 0) + 1
    }
    println("=== RETO 4 ===")
    println("Carrito: $carrito")
    println("Unidades por producto: $unidades")
    println()
}

// === RETO 5 ===
// Historial de Navegación Reversible
fun reto5() {
    val urls = arrayOf("google.com", "youtube.com", "github.com", "stackoverflow.com", "kotlinlang.org")
    val invertido = Array(urls.size) { "" }
    for (i in urls.indices) {
        invertido[i] = urls[urls.size - 1 - i]
    }
    println("=== RETO 5 ===")
    println("Original: ${urls.joinToString()}")
    println("Invertido: ${invertido.joinToString()}")
    println()
}

// === RETO 6 ===
// Compatibilidad de Intereses (Match)
fun reto6() {
    val interesesYo = setOf("inglés", "música")
    val interesesOtro = setOf("música", "videojuegos", "viajar")
    val compartidos = interesesYo.intersect(interesesOtro)
    val exclusivosYo = interesesYo.subtract(interesesOtro)
    println("=== RETO 6 ===")
    println("Mis intereses: $interesesYo")
    println("Intereses del otro: $interesesOtro")
    println("Compartidos: $compartidos")
    println("Exclusivos míos: $exclusivosYo")
    println()
}

// === RETO 7 ===
// Inventario de Despensa
fun reto7() {
    val inventario = mutableMapOf("arroz" to 5, "frijoles" to 3, "aceite" to 2, "sal" to 1)
    fun consumir(producto: String, cantidad: Int): String {
        if (!inventario.containsKey(producto)) return "Producto no existe"
        val actual = inventario[producto]!!
        if (actual < cantidad) return "Stock insuficiente"
        val nuevo = actual - cantidad
        if (nuevo == 0) {
            inventario.remove(producto)
            return "Producto $producto agotado, eliminado del inventario"
        } else {
            inventario[producto] = nuevo
            return "Consumido $cantidad de $producto, quedan $nuevo"
        }
    }
    println("=== RETO 7 ===")
    println("Inventario inicial: $inventario")
    println(consumir("arroz", 2))
    println(consumir("sal", 1))
    println(consumir("aceite", 3))
    println("Inventario final: ${inventario.toMap()}")
    println()
}

// === RETO 8 ===
// Cálculo de Promedio Académico
fun reto8() {
    val notas = listOf(4.5 to 0.3, 3.8 to 0.2, 5.0 to 0.5)
    var suma = 0.0
    for ((nota, peso) in notas) {
        suma += nota * peso
    }
    println("=== RETO 8 ===")
    println("Notas y pesos: $notas")
    println("Nota final: $suma")
    println()
}

// === RETO 9 ===
// Traductor de Códigos de País
fun reto9() {
    val codigos = mapOf("CO" to "Colombia", "US" to "Estados Unidos", "MX" to "México", "ES" to "España")
    println("=== RETO 9 ===")
    for ((codigo, pais) in codigos) {
        println("El código $codigo pertenece a $pais")
    }
    println()
}

// === RETO 10 ===
// Rotación de Turnos de Trabajo
fun reto10() {
    val empleados = listOf("Ana", "Luis", "Marta", "Javi", "Carmen")
    val k = 2
    val n = empleados.size
    val rotados = mutableListOf<String>()
    val desplazamiento = k % n
    for (i in n - desplazamiento until n) rotados.add(empleados[i])
    for (i in 0 until n - desplazamiento) rotados.add(empleados[i])
    println("=== RETO 10 ===")
    println("Empleados originales: $empleados")
    println("Rotados $k posiciones: $rotados")
    println()
}

// === RETO 11 ===
// Organizador de Maleta
fun reto11() {
    val objetos = listOf("Camisa" to 0.5, "Zapatos" to 1.2, "Laptop" to 2.5, "Libro" to 0.8, "Balón" to 0.4)
    val grupos = mutableMapOf<String, MutableList<String>>()
    for ((nombre, peso) in objetos) {
        val categoria = when {
            peso < 1.0 -> "Ligero (<1kg)"
            peso <= 2.0 -> "Mediano (1-2kg)"
            else -> "Pesado (>2kg)"
        }
        grupos.getOrPut(categoria) { mutableListOf() }.add(nombre)
    }
    println("=== RETO 11 ===")
    println("Objetos: $objetos")
    println("Agrupados por peso: $grupos")
    println()
}

// === RETO 12 ===
// Verificador de Ruta Reversible
fun reto12() {
    val ruta1 = listOf("A1", "B2", "C3", "B2", "A1")
    val ruta2 = listOf("X1", "Y2", "Z3", "W4")
    fun esEspejo(coordenadas: List<String>): Boolean {
        for (i in 0 until coordenadas.size / 2) {
            if (coordenadas[i] != coordenadas[coordenadas.size - 1 - i]) return false
        }
        return true
    }
    println("=== RETO 12 ===")
    println("Ruta 1: $ruta1 -> ¿Es espejo? ${esEspejo(ruta1)}")
    println("Ruta 2: $ruta2 -> ¿Es espejo? ${esEspejo(ruta2)}")
    println()
}

// === RETO 13 ===
// Reparto de Pedidos por Camión
fun reto13() {
    val paquetes = (1..50).toList() // 50 paquetes con IDs del 1 al 50
    val lotes = mutableListOf<List<Int>>()
    var i = 0
    while (i < paquetes.size) {
        val fin = minOf(i + 10, paquetes.size)
        lotes.add(paquetes.subList(i, fin))
        i += 10
    }
    println("=== RETO 13 ===")
    println("Total paquetes: ${paquetes.size}")
    println("Lotes de 10: ${lotes.size} lotes")
    println("Primer lote: ${lotes[0]}")
    println("Último lote: ${lotes.last()}")
    println()
}

// === RETO 14 ===
// Identificador de Ticket Único
fun reto14() {
    val ids = listOf(101, 102, 103, 101, 104, 102, 105, 106, 103, 107)
    val frecuencias = mutableMapOf<Int, Int>()
    for (id in ids) frecuencias[id] = frecuencias.getOrDefault(id, 0) + 1
    var primerUnico: Int? = null
    for (id in ids) {
        if (frecuencias[id] == 1) {
            primerUnico = id
            break
        }
    }
    println("=== RETO 14 ===")
    println("IDs: $ids")
    println("Primer ID único: $primerUnico")
    println()
}

// === RETO 15 ===
// Calculadora de IVA Selectiva
fun reto15() {
    val precios = listOf(45000.0, 60000.0, 30000.0, 120000.0, 48000.0)
    val conIva = mutableMapOf<Double, Double>()
    for (p in precios) {
        conIva[p] = if (p > 50000) p * 1.19 else p
    }
    println("=== RETO 15 ===")
    println("Precios originales: $precios")
    println("Precios con IVA selectivo: $conIva")
    println()
}

// === RETO 16 ===
// Mantenimiento de Sensores
fun reto16() {
    val sensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val iter = sensores.iterator()
    while (iter.hasNext()) {
        if (iter.next() % 3 == 0) iter.remove()
    }
    println("=== RETO 16 ===")
    println("Sensores después de eliminar múltiplos de 3: $sensores")
    println()
}

// === RETO 17 ===
// Mapa de Almacén (Matriz)
fun reto17() {
    val almacen = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 10, 11, 12),
        arrayOf(13, 14, 15, 16)
    )
    var diagPrincipal = 0
    var diagSecundaria = 0
    val n = 4
    for (i in 0 until n) {
        diagPrincipal += almacen[i][i]
        diagSecundaria += almacen[i][n - 1 - i]
    }
    println("=== RETO 17 ===")
    println("Matriz 4x4:")
    for (fila in almacen) println(fila.joinToString())
    println("Suma diagonal principal: $diagPrincipal")
    println("Suma diagonal secundaria: $diagSecundaria")
    println()
}

// === RETO 18 ===
// Fusión de Recetas
fun reto18() {
    val receta1 = mapOf("Harina" to 500.0, "Azúcar" to 200.0, "Huevos" to 4.0)
    val receta2 = mapOf("Harina" to 300.0, "Leche" to 250.0, "Huevos" to 2.0)
    val fusion = receta1.toMutableMap()
    for ((ing, cant) in receta2) {
        fusion[ing] = fusion.getOrDefault(ing, 0.0) + cant
    }
    println("=== RETO 18 ===")
    println("Receta 1: $receta1")
    println("Receta 2: $receta2")
    println("Fusión: $fusion")
    println()
}

// === RETO 19 ===
// Ranking de Apps por Calificación
fun reto19() {
    val apps = listOf("WhatsApp" to 4.5, "Spotify" to 4.8, "TikTok" to 4.2, "YouTube" to 4.9, "Facebook" to 3.9)
    val ordenadas = apps.toMutableList()
    for (i in 0 until ordenadas.size - 1) {
        for (j in i + 1 until ordenadas.size) {
            if (ordenadas[i].second < ordenadas[j].second) {
                val temp = ordenadas[i]
                ordenadas[i] = ordenadas[j]
                ordenadas[j] = temp
            }
        }
    }
    println("=== RETO 19 ===")
    println("Apps originales: $apps")
    println("Ranking de mayor a menor: $ordenadas")
    println()
}

// === RETO 20 ===
// Unión de Agendas Ordenadas
fun reto20() {
    val agenda1 = listOf("Ana", "Carlos", "Luis", "Marta")
    val agenda2 = listOf("Beatriz", "David", "Javier", "Sofía")
    val resultado = mutableListOf<String>()
    var i = 0
    var j = 0
    while (i < agenda1.size && j < agenda2.size) {
        if (agenda1[i] <= agenda2[j]) {
            resultado.add(agenda1[i])
            i++
        } else {
            resultado.add(agenda2[j])
            j++
        }
    }
    while (i < agenda1.size) resultado.add(agenda1[i++])
    while (j < agenda2.size) resultado.add(agenda2[j++])
    println("=== RETO 20 ===")
    println("Agenda 1: $agenda1")
    println("Agenda 2: $agenda2")
    println("Unión ordenada: $resultado")
    println()
}

// === RETO 21 ===
// Días de Mantenimiento (Primos)
fun reto21() {
    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
    val primos = ArrayList<Int>()
    for (piso in 1..100) {
        if (esPrimo(piso)) primos.add(piso)
    }
    println("=== RETO 21 ===")
    println("Pisos con mantenimiento especial (primos 1..100): $primos")
    println()
}

// === RETO 22 ===
// Pila de Platos Sucios
fun reto22() {
    class PilaPlatos {
        private val platos = mutableListOf<String>()
        fun push(plato: String) = platos.add(plato)
        fun pop(): String? = if (platos.isNotEmpty()) platos.removeAt(platos.size - 1) else null
        fun size() = platos.size
        fun verPila() = platos.toList()
    }
    val pila = PilaPlatos()
    pila.push("Plato 1")
    pila.push("Plato 2")
    pila.push("Plato 3")
    println("=== RETO 22 ===")
    println("Pila después de pushes: ${pila.verPila()}")
    println("Pop: ${pila.pop()}")
    println("Pop: ${pila.pop()}")
    println("Pila final: ${pila.verPila()}")
    println()
}
