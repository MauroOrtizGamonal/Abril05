package com.softtek.modelo;

public class Flauta extends InstrumentoMusical {
    private String material;

    @Override
    public String emitirSonido() {
        return "Sonido de la flauta";
    }
}
