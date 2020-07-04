import java.util.Scanner;

public class GestionCamiones {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Juan");
        System.out.println(cliente1);

        Camion c1 = new Camion();
        c1.setChapa(44444);
        c1.setColor("Negro");

        c1.setDueño(cliente1);

        System.out.println(c1);

        Camion c2 = new Camion();
        System.out.println(c2);
        c2.setColor("Negro");

        Camion camion3 = new Camion(123);
        System.out.println(camion3);


        Camion camion4 = new Camion(9000, "Verde");
        System.out.println(camion4);

        System.out.println("Ingrese el color del camion");
        String colorCamion = input.nextLine();

        System.out.println("Ingrese el modelo del camion");
        String elModelo = input.nextLine();

        System.out.println("Ingrese la chapa del camion");
        int chapaCamion = input.nextInt();


        Camion c5 = new Camion(chapaCamion, colorCamion, elModelo);
        c5.setModelo("Gold");
        System.out.println(c5);

        boolean sonIguales = c1.tieneMismoColor(c2);

        if (sonIguales == true) {
            System.out.println("Los camiones tienen el mismo color");
        } else {
            System.out.println("Los camiones NO tienen el mismo color");
        }
    }

}
