//Método que reciba un número entero y un número double, y retorne su multiplicación. ¿Qué tipo de retorno tiene este método?
package Practico;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese Número!!");
        int numen1 = input.nextInt();
        System.out.println("Ingrese otro Número!!");
        double numdoble2 = input.nextDouble();
        System.out.println("La Multiplicación es: " + multiplicacion(numen1,numdoble2));
        System.out.println("Fin del Programa!!");
    }
    public static double multiplicacion (int numen1,double numdoble2) {
        double multiplicaion = numen1 * numdoble2;
        return multiplicaion;
    }
}
