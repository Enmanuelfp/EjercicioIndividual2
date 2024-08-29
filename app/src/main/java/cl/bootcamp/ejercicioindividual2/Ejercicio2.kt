package cl.bootcamp.ejercicioindividual2

import androidx.compose.ui.text.toLowerCase


    fun main (){

        var edad : Int = 0
        var diaSemana : String
        var precioEntrada : Int = 0

        println("Hola, Bienvenidos al parque de diversiones");
        println("Por favor Ingrese su edad");
        edad = readln().toInt();
        do {
            if (edad <=0 || edad > 100){
                println("Edad invalida, ingrese una edad valida")
                edad = readln().toInt()
            }
        }while (edad <0 || edad > 100)

        println("Gracias");
        println("Por favor ingrese el dia de la semana");
        diaSemana = readln().toString();

        when{

            edad <=4 -> precioEntrada = 0
            edad <= 15 -> precioEntrada =15000
            edad <= 60 -> {
                precioEntrada = 30000
                if (diaSemana.toLowerCase() == "lunes" || diaSemana.toLowerCase() == "martes" ){
                    precioEntrada = 25000
                }
            }
            edad > 60 -> precioEntrada = 20000
        }

        println("El precio a pagar es $precioEntrada")

    }
