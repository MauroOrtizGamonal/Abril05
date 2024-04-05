package com.softtek.modelo;

public class Bateria extends InstrumentoMusical {
    private int noPlatillos;

    @Override
    public String emitirSonido() {
        return "Sonido de la batería";
    }
}
