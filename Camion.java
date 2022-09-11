package Practico5;

public class Camion {
    //Artributos
    //Los atributos son las caracteristicas que va a tener el Camion
    private int chapa;
    private String color;
    private int año;
    private static  int CONTADOR_CAMIONES = 1000;
    private int identifacadorCamion;


    //Contructore
    //Este es un constructor sin parametros
    public Camion() {
        this.chapa = 0;
        this.color = "Rojo";
        this.año = 2020;
        CONTADOR_CAMIONES ++;
        this.identifacadorCamion = CONTADOR_CAMIONES;
    }

    //Constructor con un parametro
    public Camion(int unaChapa) {
        if (unaChapa < 1000) {
            this.chapa = 0;
        } else {
            this.chapa = unaChapa;
        }
        this.color = "Verde";
        this.año= 2020;
        CONTADOR_CAMIONES ++;
        this.identifacadorCamion = CONTADOR_CAMIONES;
    }
    public Camion(String unColor) {
        this.chapa = 1000;
        this.color = unColor;
        this.año = 2020;
        CONTADOR_CAMIONES ++;
        this.identifacadorCamion = CONTADOR_CAMIONES;
    }
//Constructor con 2 parametros
    public Camion(int unaChapa, String unColor) {
        if (unaChapa < 1000) {
            this.chapa = 0;
        }else {
            this.chapa = unaChapa;
        }
        this.color = unColor;
        this.año = 2020;
        CONTADOR_CAMIONES ++;
        this.identifacadorCamion = CONTADOR_CAMIONES;
    }

    //Metodos
//Metodos que me permitan cambiar los atributos del Camion
    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }

    public int getChapa() {
        return this.chapa;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }

    public String getColor() {
        return this.color;

    }
    public void setAño (int unAño) {
        this.año = unAño;
    }
    public  int getAño(){
        return this.año;
    }
    private boolean leTocaRevision(){
        if (this.getAño() < 2015){
            return true;
    }else {
            return false;
        }
    }

    public boolean tieneMismoColor( Camion unCamion){
        return this.getColor().equals(unCamion.getColor());
    }
    public String toString (){
        String retorno = " El camion " + this.identifacadorCamion + " es de color " + this.getColor() + " y su chapa es " + this.getChapa() + " . El año del camion es " + this.getAño();
        //return "El camion es de color " + this.getColor() + " y su chapa es "
              //  + this.getChapa() + " . El año del camion es " + this.getAño()
       if (this.leTocaRevision() == true) {
           retorno += " Y le toca revisión ";
        } else {
           retorno += " Y no le toca revisión ";
        }
        return retorno;
    }
    //Creación de Objetos
    //Un objeto se crea con la palabra clave new
    //La palabra clave new "da vida" al objeto, esdecir lo crea en memoria...
// Scanner es el nombre de la clase
    //Input es el nombre del objeto
    //System.in son los parametros del contructor
    //New es la creación del objeto en memoria

}

