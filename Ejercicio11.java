//Crear un método que reciba un entero, y muestre en pantalla la cantidad de dólares y de euros que representa ese número.
package Practico;

import java.util.Scanner;

public class Ejercicio11 {
    public static float EUR = 50;
    public static float DOLAR = 42;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese un Valor!!");
        float pesos = input.nextFloat();
        conversionMoneda(pesos);
    }
    public static void  conversionMoneda(float numero) {
        System.out.println(numero / EUR);
        System.out.println(numero / DOLAR);
    }
}
