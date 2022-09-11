//Crear un método que reciba un número entero n, y muestre en pantalla la suma desde 1 hasta ese número n.
// Ej. Si “n” es 4, se debe mostrar en pantalla 10.
package Practico;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese Número!!");
        int nume = input.nextInt();
        System.out.println("La sumatoria desde el 1 hasta el número ingresado es de: " + sumatoria(nume));
        }
    public static int sumatoria (int nume){
        int sumatoria = 0;
        for (int i= 1; i <= nume; i++) {
            sumatoria = sumatoria + i;
        }
        return sumatoria;
      }
    }

