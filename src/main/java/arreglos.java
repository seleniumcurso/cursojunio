
import java.util.*;

public class arreglos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer [] horas = new Integer [5];

        int suma = 0;
        for (int i = 0; i < horas.length; i++) {
            System.out.println("Ingrese un numero: ");
            int num = input.nextInt();
            horas[i] = num;
            suma = suma + num;
        }

        imprimirArregloEnteros(horas);
        float promedio = suma / horas.length;
        System.out.println("El promedio es " + promedio);

    }
    

    public static void imprimirArregloEnteros (Integer[] arregloEnteros) {

        for (int i = 0; i < arregloEnteros.length; i++) {
            System.out.println("Posicion " + i + " es: " + arregloEnteros[i]);
        }
    }

}
