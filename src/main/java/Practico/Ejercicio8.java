//Crear un método que retorne verdadero si y sólo si el número es par, de lo contrario, debe retornar falso.
package Practico;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese Número!!");
        int numr = input.nextInt();
        if (esPar(numr)) {
            System.out.println("El número es Par");
            } else {
            System.out.println("El número no es Par");
        }
           }
    public static boolean esPar(int numr) {
        if (numr%2==0) {
            return true;
        } else {
            return false;
        }
    }
}
