package com.dam2;

public class Funciones {

    /**
     * @param tablero
     * @return
     */
    public static Boolean generarAleatorio(Tablero auxTablero) {
        auxTablero.setCifraAleatoria("54432");
        return true;
    }

    public static Boolean pedirSecuencia(Tablero tablero) {
        return null;
    }

    public static void mostrar(String mensaje) {
    }

    /**
     *
     * @param cifraAleatoria cifra generada
     * @param cifraSecuencia cifra introducida por el jugador
     * @return
     */
    public static Boolean comprobarSecuencia(String cifraAleatoria, String cifraSecuencia) {

        // comparar
        return cifraAleatoria.equals(cifraSecuencia);

    }

    public static String mostrarPista(Tablero tablero) {


        return null;
    }
}
