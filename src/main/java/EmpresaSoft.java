import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaSoft {

    public static void main (String args[]){
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        Scanner input = new Scanner(System.in);

        int opcion = 0;
        System.out.println("*** BIENVENIDOS *****");
        while (opcion != 4){
            System.out.println("1- Ingresar Tester");
            System.out.println("2- Ingresar Desarrollador");
            System.out.println("3- Ver Empleados");
            System.out.println("4- Salir");
            opcion = input.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del tester");
                String nombre = input.next();

                Empleado tester = new Tester(nombre, 1234123, 123412,true, false);
                listaEmpleados.add(tester);

            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del desarrollador");
                String nombre = input.next();

                Empleado dev = new Developer(nombre,123123,199999,"Phyton");
                listaEmpleados.add(dev);

            } else if (opcion == 3) {
                imprimirEmpleados(listaEmpleados);

            } else {
                System.out.println("Saliendo!! Chauuu");
            }

            System.out.println("****************");

        }

/*
        System.out.println("Ingese su nombre....");
        String nombre = input.nextLine();

        System.out.println("Ingrese 1 si es tester manual, o 0 si no lo es");
        opcion = input.nextInt();

        boolean esTesterManual;
        if (opcion == 1) {
            esTesterManual = true;
        } else {
            esTesterManual = false;
        }

        System.out.println("Ingrese 1 si es tester automatizador, o 0 si no lo es");
        int opcionAutomatizador = input.nextInt();

        boolean esTesterAutomatizador;
        if (opcionAutomatizador == 1) {
            esTesterAutomatizador = true;
        } else {
            esTesterAutomatizador = false;
        }

        Empleado t1 = new Tester(nombre, 12341234, 10000, esTesterManual, esTesterAutomatizador);

        Empleado t2 = new Developer("Ana",44444, 12222,"Java");





        //listaEmpleados.add(t1);
        //listaEmpleados.add(t2);
        imprimirEmpleados(listaEmpleados);*/
    }

    private static void imprimirEmpleados(ArrayList<Empleado> listaEmpleados){
        System.out.println("******* LISTA DE EMPLEADOS *******");
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados en el sistema");
        } else {
            for (Empleado unEmpleadoDelSistema : listaEmpleados ){
                System.out.println(unEmpleadoDelSistema);
            }
        }

    }



}
