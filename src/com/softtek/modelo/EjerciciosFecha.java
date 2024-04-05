package com.softtek.modelo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class EjerciciosFecha {

    public static LocalDate calcularFechaInicioCurso() {
        LocalDate fechaInicioCurso = LocalDate.of(2024, 3, 1); // Suponiendo que el curso comienza el 1 de marzo de 2024
        return fechaInicioCurso.plusDays(10);
    }

    public static LocalDate calcularFechaHoyPorDefecto() {
        return LocalDate.now();
    }

    public static LocalDate calcularFechaHoyAustralia() {
        return LocalDate.now(ZoneId.of("Australia/Sydney"));
    }

    public static LocalDate calcularDia100() {
        return LocalDate.of(2024, 1, 1).plusDays(99);
    }

    public static String compararFechasNavidadNocheVieja() {
        LocalDate navidad = LocalDate.of(2024, 12, 25);
        LocalDate nocheVieja = LocalDate.of(2024, 12, 31);
        if (navidad.isBefore(nocheVieja)) {
            return "Navidad es antes de Nochevieja.";
        } else if (navidad.isAfter(nocheVieja)) {
            return "Navidad es después de Nochevieja.";
        } else {
            return "Navidad es el mismo día que Nochevieja.";
        }
    }

    public static LocalDate calcularFechaSumandoSemanas() {
        return LocalDate.of(2024, 3, 15).plusWeeks(35);
    }

    public static long calcularAniosTrabajados(LocalDate fechaInicio) {
        LocalDate fechaFin = LocalDate.now();
        return ChronoUnit.YEARS.between(fechaInicio, fechaFin);
    }

    public static long calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
    }

    public static LocalDate calcularFechaInicioProyecto(int diasDuracion, LocalDate fechaEntrega) {
        return fechaEntrega.minusDays(diasDuracion);
    }

    public static long calcularPeriodoProyecto(LocalDate fechaInicio, LocalDate fechaFin) {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }
}
