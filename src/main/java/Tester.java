public class Tester extends Empleado {

    private boolean testerManual;
    private boolean testerAutomatizador;

    public Tester(String unNombre, int unTel, float unSueldo, boolean esManual, boolean esAutomatizador){

        super(unNombre, unTel, unSueldo);

        this.testerManual = esManual;
        this.testerAutomatizador = esAutomatizador;
    }

    public boolean getTesterManual(){
        return this.testerManual;
    }

    public void setTesterManual(boolean esManual){
        this.testerManual = esManual;
    }

    public boolean getTesterAutomatizador(){
        return this.testerAutomatizador;
    }

    public void setTesterAutomatizador(boolean esAuto){

        if (esAuto == true){
            this.testerManual = true;
        }
        this.testerAutomatizador = esAuto;
    }

    public String toString(){
        String retorno = "";
        retorno += "Nombre del empleado: " + this.getNombre();
        retorno += ". Sueldo del empleado: " + this.getSueldo();
        retorno += ". Telefono del empleado: " + this.getTelefono();

        if (testerManual == true){
            retorno += " Es tester Manual.";
        } else {
            retorno += " NO Es tester Manual.";

        }
        if (testerAutomatizador == true){
            retorno += " Es tester Automatizador.";
        } else {
            retorno += " NO Es tester Automatizador.";

        }

        return  retorno;

    }

}
