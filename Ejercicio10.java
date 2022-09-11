//Crear un método que permita reciba el alto y ancho de un paralelogramo tipo, y retorne su area.
package Practico;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio del Programa!!");
        System.out.println("Ingrese el Alto!!");
        float alto = input.nextInt();
        System.out.println("Ingrese Ancho!!");
        float ancho = input.nextInt();
        System.out.println("El Area del Paralelogramo es: " + areaParalelogramo(alto,ancho));
    }
    public static float areaParalelogramo (float alto, float ancho) {
        float area = alto * ancho;
        return area;
    }
}
