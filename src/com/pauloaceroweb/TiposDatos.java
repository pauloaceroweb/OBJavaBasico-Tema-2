package com.pauloaceroweb;

public class TiposDatos {

    public static void main(String[] args) {
        // Tipos de datos

        // 1. Numéricos
        // 1.1. Enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;

        System.out.println("TIPOS DE DATOS");
        System.out.println("1. Numéricos");
        System.out.println("*********************");
        System.out.println("1.1. Enteros");
        System.out.println("Byte: " + variable1);
        System.out.println("Short: " + variable2);
        System.out.println("Int: " + variable3);
        System.out.println("Long: " + variable4);
        System.out.println("*********************");

        // 1.2. Decimales
        float variable5 = 2.36f;
        double variable6 = 8.65d;

        System.out.println("1.2. Decimales");
        System.out.println("Float: " + variable5);
        System.out.println("Double: " + variable6);
        System.out.println("*********************");

        // 2. Booleano
        boolean variable7 = true;
        boolean variable8 = false;

        System.out.println("2. Booleanos");
        System.out.println("Verdadero: " + variable7);
        System.out.println("Falso: " + variable8);
        System.out.println("*********************");

        // 3. Texto
        char variable9 = 'a';
        String variable10 = "Hola Open Bootcamp";

        System.out.println("3. Texto");
        System.out.println("Char: " + variable9);
        System.out.println("String: " + variable10);
        System.out.println("*********************");
    }

}
