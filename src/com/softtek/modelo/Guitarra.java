package com.softtek.modelo;

public class Guitarra extends InstrumentoMusical {
    private String tipoCuerdas;

    @Override
    public String emitirSonido() {
        return "Sonido de la guitarra";
    }
}
