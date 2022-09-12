public class GestionProductos {

    public static void main (String args []){

        Producto prod1 = new Producto();
        prod1.setNombre("Harina");
        prod1.setCodigo(1000);
        prod1.setEsImportado(false);
        prod1.getNroLote("Ag300");
        prod1.setNroProducto(23847);
        System.out.println(prod1);

        System.out.println("***********************************");

        Producto prod2 = new Producto( "Arroz" , 1000, false, "AR500", 90 );
        System.out.println(prod2);

        System.out.println("*******************************");

        Producto prod3 = new Producto( "Carne" , 1992, false, "AR800", 100 );
        System.out.println(prod3);


    }
}
