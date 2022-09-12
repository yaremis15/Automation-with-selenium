public class Producto {
    //Definir los Atributos
                private String nombre;
                private int codigo;
                private  boolean esImportado;
                private int nroProducto;
                private String nroLote;

//Creación de contructores sin parametros

    public Producto(){
        this.nombre = "desconocido";
        this.codigo = 0;
        this.esImportado = false;
        this.nroLote = "desconocido";
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
    }

    //Crear una variable estatica (Static) de la clse producto

     private static int CONTADOR_PRODUCTO = 0;


    //Creación de contructores con parametros

    public Producto (String unNombre, int unCodigo, boolean importado, String lote, int nroProd){
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.esImportado = importado;
        this.nroLote = lote;
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
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
    public void setNroLote (String lote){
        this.nroLote = lote;
    }
    public String getNroLote( String lote){
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
        textoAImprimir += " El número de lote es: " + this.nroLote + " El número de producto es: " + this.nroProducto;

        return textoAImprimir;
    }
}
