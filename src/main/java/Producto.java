public class Producto {
    //Definir los Atributos
                private String nombre;
                private int codigo;
                private  boolean esImportado;
                private int nroProducto;
                private int nroLote;

//Creación de contructores sin parametros

    public Producto(){
        this.esImportado = false;
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
        CONT_LOT = CONT_LOT + 1;
        this.nroLote = CONT_LOT;
        CONT_COD = CONT_COD + 1;
        this.codigo = CONT_COD;

    }

    //Crear una variable estatica (Static) de la clse producto

     public static int CONTADOR_PRODUCTO = 100;
     public   static int CONT_LOT = 200;
     public  static  int CONT_COD = 300;

    //Creación de contructores con parametros
    public Producto (String unNombre, int unCodigo, boolean importado, String lote, int nroProd){
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.esImportado = importado;
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
        CONT_LOT = CONT_LOT + 1;
        this.nroLote= CONT_LOT;
        CONT_COD = CONT_COD + 1;
        this.codigo = CONT_COD;
    }
    //Setters y getters
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre( String unNombre){
        return this.nombre;
    }
    public void setCodigo (int unCodigo){
        this.codigo = unCodigo;
    }
    public int getCodigo( int inCodigo){
        return this.codigo;
    }
    public void setEsImportado (boolean importado){
        this.esImportado = importado;
    }

    public boolean getEsImportado ( boolean importado){
        return this.esImportado;
    }
    public void setNroProducto (int nroProd){
        this.nroProducto = nroProd;
    }
    public int getNroProducto (int nroProd){
        return this.nroProducto;
    }
    public void setNroLote (int lote){
        this.nroLote = lote;
    }
    public int getNroLote(int lote){
        return this.nroLote;
    }

    //Acá realizaremos en toString
    public String toString(){
        String textoAImprimir = " El nombre del producto es: " + this.nombre + " y su codigo es: " + this.codigo;
        if (this.esImportado == true){
            textoAImprimir += " Es importado ";
        } else {
            textoAImprimir += " Es nacional ";
        }
        textoAImprimir += " El número de lote es: " + this.nroLote + " Y el número de producto es: " + this.nroProducto;

        return textoAImprimir;
    }
}
