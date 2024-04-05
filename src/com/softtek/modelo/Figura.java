package com.softtek.modelo;

public class Figura {
    protected int x;
    protected int y;

    public double calcularArea() {
        return 0.0; // Implementación específica en las subclases
    }

    public String mostrarPosicion() {
        return "Posición: (" + x + ", " + y + ")";
    }
}
