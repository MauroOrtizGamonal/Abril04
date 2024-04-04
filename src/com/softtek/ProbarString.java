package com.softtek;

public class ProbarString {
    public static void main(String[] args) {
        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println(frase);
        String fraseEnMayusculas = frase.toUpperCase();
        System.out.println(fraseEnMayusculas);
        String fraseEnMinusculas = frase.toLowerCase();
        System.out.println(fraseEnMinusculas);
        String[] palabras = frase.split(" ");
        String palabra = palabras[0];
        System.out.println(palabra);
        String palabraMosca = palabras[3];
        System.out.println(palabraMosca);
        String palabraCabeza = palabras[6];
        System.out.println(palabraCabeza);
        int posicionM = frase.indexOf('m');
        System.out.println("La posición de la primera letra 'm' es: " + posicionM); 
        int longitud = frase.length();
        System.out.println("La longitud de la cadena es: " + longitud);
    }
}

