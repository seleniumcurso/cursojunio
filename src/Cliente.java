public class Cliente {

    private String nombre;
    private int edad;
    private int DNI;

    public Cliente(){
        this.DNI = 0;
        this.edad=99;
        this.nombre ="Sin nombre";
    }

    public Cliente (String unNombre) {
        this.nombre = unNombre;
        this.edad = 99;
        this.DNI = 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String toString(){
        return "El nombre del cliente es " + this.getNombre();
    }
}
