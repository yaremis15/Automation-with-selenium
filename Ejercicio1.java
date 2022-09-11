//1. Escribir un método que reciba un número y retorne su doble
package Practico;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese Número!!");
        int num = input.nextInt();
        int duplicar = calcularDoble (num);
        System.out.println("El doble del número es: " + duplicar);
    }
    public static int calcularDoble(int num) {
        return num * 2;
    }
}
