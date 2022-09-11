/**
 * Realizar un método que reciba dos números y retorne el mayor de ambos
 */
package Practico;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese Número!!");
        int num1 = input.nextInt();
        System.out.println("Ingrese otro Número!!");
        int num2 = input.nextInt();
        if (mayorDeDosNumeros(num1, num2)) {
            System.out.println("El mayor de los números es: " + num1);
        } else {
            System.out.println("El mayor de los números es: " + num2);
        }
    }

    public static boolean mayorDeDosNumeros(int num1, int num2) {
        if (num1 > num2) {
            return true;
        } else {
            return false;
        }
    }
}
