//Método que reciba dos números y retorne su suma
package Practico;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese Número!!");
        int num1 = input.nextInt();
        System.out.println("Ingrese otro Número!!");
        int num2 = input.nextInt();
        System.out.println("La Suma es: " + suma(num1, num2));
        System.out.println("Fin del Programa!!");
    }

    public static int suma(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
