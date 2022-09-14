public class GestionProductos {

    public static void main (String args []){

        System.out.println("Producto 1");
        Producto prod1 = new Producto();
        prod1.setNombre("Harina");
        prod1.setEsImportado(false);
        System.out.println(prod1);

        System.out.println("Producto 2");

        Producto prod2 = new Producto( "Arroz" , 1000, false, "AR500", 90 );
        System.out.println(prod2);

        System.out.println("Producto 3");

        Producto prod3 = new Producto( "Carne" , 1992, false, "AR800", 100 );
        System.out.println(prod3);

        System.out.println("Producto 4");

        Producto prod4 = new Producto( "aceite" , 1993, true, "AR801", 101 );
        System.out.println(prod4);

    }
}
