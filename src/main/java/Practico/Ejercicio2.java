// 2. Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20, “Es mayor a 20”. De lo contrario, imprimir
// “No es mayor a 20”.
package Practico;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese Número!!");
        int numero = input.nextInt();
        if (esMayor(numero)) {
            System.out.println("El número ingresado es mayor a 20 ");
        } else {
            System.out.println("El número ongresado es menor a 20 ");

        }
        System.out.println("Fin del Programa!!");
    }
    public static boolean esMayor (int numero) {
        if (numero > 20) {
            return true;
        } else {
            return false;
        }
    }
}