import kotlin.math.E

fun main() {
    println("""
                                               BIENVENIDO
        Aquí se determina el estado nutricional de una persona según su índice de masa corporal
        
    """.trimIndent())

    val ListDatos = mutableListOf<Datos>()//Lista de almacenamiento
    //Recoleccion de datos
    println("Ingrese el nombre")
    val Nombre = readln()
    println("Ingrese el apellido")
    val Apellido = readln()
    println("Ingrese el número de cedula")
    val Cedula = readln().toInt()
    println("Ingrese la edad")
    val Edad = readln().toInt()
    println("Ingrese su peso en kilogramos")
    var peso = readln().toInt()
    println("Ingrese su estatura en metros")
    var estatura = readln().toDouble()

    //Aquí se guardan los datos de la lista
    val daticos = Datos(Nombre, Apellido, Cedula, Edad)
    ListDatos.add(daticos)

    //Listado de datos registrados
    println("Datos ingresados")
    ListDatos.forEach{ est ->
        println("""
            Nombre: ${Nombre}
            Apellido: ${Apellido}
            Edad: ${Edad}
            Cedula: ${Cedula}
        """.trimIndent())

    }

    //Formula IMC = Peso(kg)/Estatura(m)*Estatura(m)
    var Resultado = peso / (estatura*estatura)

    //Clasificación IMC y su valor correspondiente
    if (Resultado < 16){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Delgadez severa
        """.trimIndent())
    }else if (Resultado >= 16 && Resultado <= 16.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Delgadez moderada
        """.trimIndent())
    }else if (Resultado >= 17 && Resultado <= 18.49){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Delgadez leve
        """.trimIndent())
    }else if (Resultado >= 18.50 && Resultado < 18.51 ){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Bajo peso
        """.trimIndent())
    }else if (Resultado > 18.5 && Resultado <= 24.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Normal
        """.trimIndent())
    }else if (Resultado >= 25.0 && Resultado < 25.1){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Sobrepeso
        """.trimIndent())
    }else if (Resultado >= 25.01 && Resultado <= 29.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Preobeso
        """.trimIndent())
    }else if (Resultado > 29 && Resultado < 30.1){//88 y 1.71
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad
        """.trimIndent())
    }else if (Resultado >= 30.1 && Resultado <= 39.9){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad leve
        """.trimIndent())
    }else if (Resultado >= 35.0 && Resultado <= 39.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad media
        """.trimIndent())
    }else{
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad mórbida
        """.trimIndent())
    }

// Código realizado a conciencia y con apuntes de la clase
// Se usa inteligencia artificial para investigar y saber el uso de la lista y
// la entrada de datos pero no se usa para modificación de código
}