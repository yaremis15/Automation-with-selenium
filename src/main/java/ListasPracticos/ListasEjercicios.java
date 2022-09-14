package ListasPracticos;

import java.util.ArrayList;

public class ListasEjercicios {
 public static void main (String[] args) {
     ArrayList<String> listaNombre = new ArrayList<String>();
     ArrayList<String> listaCiudades = new ArrayList<String>();
     listaCiudades.add("Medellin");
     listaCiudades.add("Monteria");
     listaCiudades.add("Bogotá");
     listaCiudades.add("Lorica");
     listaNombre.add("Jhon");
     listaNombre.add("Ana");
     listaNombre.add("Cami");
     listaNombre.add("Luisa");
     esListaVacia(listaNombre);
     imprimirLista(" El nombre es " , listaNombre);
     imprimirLista(" La ciudades es " ,listaCiudades);
     listaNombre.remove(1);

     System.out.println("********************");
     System.out.println(" Borrando a Ana");
     System.out.println("...........................");
     imprimirLista(" El nombre es " , listaNombre);

     System.out.println("********************");

     listaNombre.add("Ana");
     System.out.println(" Agregando a Ana ");

     imprimirLista(" El nombre es " , listaNombre);
     listaNombre.clear();
     esListaVacia(listaNombre);
 }
 public static void esListaVacia(ArrayList<String> unaLista){
     if(unaLista.isEmpty()) {
         System.out.println("****************");
         System.out.println(" No hay elementos !!");

     } else {
         System.out.println("***************");
         System.out.println(" Hay elementos !!");

     }

 }
 public static void imprimirLista( String mensaje, ArrayList<String> unaLista){

     for (int i = 0; i <unaLista.size(); i++) {
         System.out.println( mensaje + " " + unaLista.get(i));
     }
 }
  {
    }
     }