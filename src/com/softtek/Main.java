package com.softtek;

import com.softtek.modelo.EjerciciosFecha;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;
import com.softtek.modelo.Cuadrado;
import com.softtek.modelo.InstrumentoMusical;
import com.softtek.modelo.Guitarra;
import com.softtek.modelo.Bateria;
import com.softtek.modelo.Flauta;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Ejercicio a: Declarar la fecha de inicio del curso y le sumamos 10 días
        LocalDate fechaInicioCurso = EjerciciosFecha.calcularFechaInicioCurso();
        System.out.println("Fecha de inicio del curso más 10 días: " + fechaInicioCurso);

        // Ejercicio b: Declarar la fecha de hoy con la zona horaria por defecto
        LocalDate fechaHoyPorDefecto = EjerciciosFecha.calcularFechaHoyPorDefecto();
        System.out.println("Fecha de hoy con la zona horaria por defecto: " + fechaHoyPorDefecto);

        // Ejercicio c: Declarar la fecha de hoy con la zona horaria de “Australia/Sydney”
        LocalDate fechaHoyAustralia = EjerciciosFecha.calcularFechaHoyAustralia();
        System.out.println("Fecha de hoy con la zona horaria de Australia/Sydney: " + fechaHoyAustralia);

        // Ejercicio d: Cual es el día 100 de 2024
        LocalDate dia100 = EjerciciosFecha.calcularDia100();
        System.out.println("El día 100 de 2024 es: " + dia100);

        // Ejercicio e: Definir una fecha para navidad y otra para noche vieja y compararlas
        String comparacionNavidadNocheVieja = EjerciciosFecha.compararFechasNavidadNocheVieja();
        System.out.println(comparacionNavidadNocheVieja);

        // Ejercicio f: Calcular la fecha resultante sumando 35 semanas al 15 de marzo de 2024
        LocalDate fechaResultante = EjerciciosFecha.calcularFechaSumandoSemanas();
        System.out.println("Fecha resultante sumando 35 semanas al 15 de marzo de 2024: " + fechaResultante);

        // Ejercicio g: Calcular los años trabajados en una empresa desde el 6 de Julio de 2012
        LocalDate fechaInicioTrabajo = LocalDate.of(2012, 7, 6);
        long aniosTrabajados = EjerciciosFecha.calcularAniosTrabajados(fechaInicioTrabajo);
        System.out.println("Años trabajados en la empresa: " + aniosTrabajados);

        // Ejercicio h: Calcular la edad de una persona que nació el 7 de agosto de 2007
        LocalDate fechaNacimiento = LocalDate.of(2007, 8, 7);
        long edad = EjerciciosFecha.calcularEdad(fechaNacimiento);
        System.out.println("Edad de la persona: " + edad);

        // Ejercicio i: Calcular la fecha de inicio de un proyecto si dura 200 días y se entrega el 2 de octubre de 2024
        LocalDate fechaEntregaProyecto = LocalDate.of(2024, 10, 2);
        LocalDate fechaInicioProyecto = EjerciciosFecha.calcularFechaInicioProyecto(200, fechaEntregaProyecto);
        System.out.println("Fecha de inicio del proyecto: " + fechaInicioProyecto);

        // Ejercicio j: Calcular el periodo de un proyecto que inicia el 15 de marzo y termina el 20 de octubre
        LocalDate fechaInicioProyectoJ = LocalDate.of(2024, 3, 15);
        LocalDate fechaFinProyectoJ = LocalDate.of(2024, 10, 20);
        long periodoProyecto = EjerciciosFecha.calcularPeriodoProyecto(fechaInicioProyectoJ, fechaFinProyectoJ);
        System.out.println("Período del proyecto: " + periodoProyecto + " días.");

        // Crear instancias de Figura y sus subclases
        Figura cuadrado = new Cuadrado(5);
        Figura triangulo = new Triangulo(4, 6);

        // Calcular área y mostrar posición de cada figura
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println(cuadrado.mostrarPosicion());

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println(triangulo.mostrarPosicion());

        // Crear instancias de InstrumentoMusical y sus subclases
        InstrumentoMusical guitarra = new Guitarra();
        InstrumentoMusical bateria = new Bateria();
        InstrumentoMusical flauta = new Flauta();

        // Emitir sonido de cada instrumento
        System.out.println(guitarra.emitirSonido());
        System.out.println(bateria.emitirSonido());
        System.out.println(flauta.emitirSonido());
    }
}
