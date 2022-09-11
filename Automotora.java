package Practico5;

import java.util.Scanner;

public class Automotora {
     public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
         Camion camion0 = new Camion();
         Camion camion1 = new Camion();
         Camion camion2 = new Camion();
         System.out.println(camion0);
         System.out.println(camion1);
         System.out.println(camion2);

         System.out.println("Ingrese el color del camion 1 ");
         String colorDelCamion = input.next();
         System.out.println("Ingrese la chapa del camion 2 ");
         int chapaDelCamion = input.nextInt();

         Camion c1 = new Camion();
         System.out.println(" Datos del camion c1 " + c1 );
         System.out.println("La chapa es " + c1.getChapa());
         System.out.println("El color es " + c1.getColor());
         System.out.println("Actualizando datos ...");
         c1.setChapa(chapaDelCamion);
         c1.setColor(colorDelCamion);
         c1.setAño(2010);

       /* if (c1.()) == true) {
    System.out.println(" Al camion le toca revision ");
         } else {
    System.out.println(" No le toca revision !! ");*/
         System.out.println(c1);
         //System.out.println(" Se han creado " + c1.CONTADOR_CAMIONES + " camiones ");
       //  System.out.println(" El color de c1 es " + c1.getColor());
      //   System.out.println(" El coloe de camion2 es " + camion2.getColor());
        System.out.println(" Tiene mismo color? " + c1.tieneMismoColor(camion2));

         if (c1.tieneMismoColor(camion2) == true){
             System.out.println("Los camiones c1 y camion2 tienen el mismo color ");
         } else {
             System.out.println(" No tienen el mismo color ");
         }



        // System.out.println("Ingrese el color del camion 2 ");
        // String colorCamion2 = input.next();
        // System.out.println("Ingrese la chapa del camion 2 ");
      //   int chapaCamion2 = input.nextInt();

         //Camion camion2 = new Camion(chapaCamion2, colorCamion2);
        // System.out.println(" **** Datos del camion 2 ****");
      //    System.out.println(camion2);
         /*
         System.out.println("*********************");
         Camion camion2 = new Camion(1233);
         //System.out.println("Datos del camion 2");
         //System.out.println("La chapa es " + camion2.getChapa());
         //System.out.println("El color es " + camion2.getColor());
         System.out.println(camion2);

         System.out.println("***************");
         Camion c3 = new Camion( 777, "Blanco");
         //System.out.println("Datos del camion c3");
         //System.out.println("La chapa es " + c3.getChapa());
         //System.out.println("El color es " + c3.getColor());
         System.out.println(c3); */
    }

}
