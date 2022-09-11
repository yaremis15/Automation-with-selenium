// Realizar un método llamado calcularIva, que calcule el IVA (22%) dado un número float
// llamado sueldo, recibido por parámetro. Sugerencia: utilizar variables estáticas.
package Practico;

import java.util.Scanner;

public class Ejericio12 {
    public static final int IVA = 19;
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su Sueldo");
      float  sueldo = input.nextFloat();
        System.out.println("El IVA de su Sueldo es de: " + calcularIva(sueldo));
    }
public static float calcularIva (float sueldo){
        float calculo = IVA * sueldo / 100;
       return calculo;
   }
}
