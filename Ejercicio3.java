// 3. Método que reciba dos enteros y retorne la multiplicación de la misma.

package Practico;
import java.util.Scanner;
public class Ejercicio3 {
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            System.out.println("Inicio del Programa!!");
            System.out.println("Ingrese Número!!");
            int nume = input.nextInt();
            System.out.println("Ingrese otro Número!!");
            int nume2 = input.nextInt();
            System.out.println("La multiplación es: " + multiplicacion(nume, nume2));
            System.out.println("Fin del Programa!!");
        }
    public static int multiplicacion(int nume, int nume2) {
        int multi = nume * nume2;
        return multi;
    }
}
