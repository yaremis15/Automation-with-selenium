//Crear un método que permita reciba el radio de un círculo, y retorne su area
// (radio^2)*PI (utilizar una variable estática para el valor de PI)
package Practico;

import java.util.Scanner;

public class Ejercicio9 {
    public static final double PI = 3.14;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese Número!!");
        double radio = input.nextDouble();
        System.out.println("El area del circulo es: " + areaCirculo(radio));
    }
    public static double areaCirculo (double radio) {
        double area = radio * radio * PI;
        return area;
    }
}
