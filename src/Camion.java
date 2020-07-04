public class Camion {
    //atributos
    private int chapa;
    private String color;
    private String modelo;
    private static int IDENTIFICADOR = 0;
    private Cliente dueño;

    //constructor
    public Camion(){
        this.color= "Desconocido";
        this.chapa= 00000000;
        this.modelo = "Desconocido";
        IDENTIFICADOR++;
    }

    public Camion(int unaChapa){
        this.color= "Desconocido";
        this.chapa= unaChapa;
        IDENTIFICADOR++;

    }

    public Camion(int unaChapa, String unColor){
        this.color= unColor;
        this.chapa= unaChapa;
        IDENTIFICADOR++;

    }

    public Camion(int unaChapa, String unColor, String unModelo){
        this.color= unColor;
        this.chapa= unaChapa;
        this.modelo = unModelo;
        IDENTIFICADOR++;
    }


    //metodos de acceso y modificacion
    public int getChapa(){
        return this.chapa;
    }

    public void setChapa (int unaChapa) {
        this.chapa = unaChapa;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor (String unColor) {
        this.color = unColor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String unModelo) {
        this.modelo = unModelo;
    }

    public void setDueño(Cliente unDueño){
        this.dueño = unDueño;
    }

    public Cliente getDueño (){
        return this.dueño;
    }

    //comparar si dos camiones tienen el mismo color....
    public boolean tieneMismoColor (Camion otroCamion){
        return this.getColor().equals(otroCamion.getColor());
    }

    public String toString(){
        return "Camion de color " + this.getColor() + " con una chapa " + this.getChapa() + ". El modelo es " + this.getModelo();
    }

}
