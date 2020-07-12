import java.util.*;

public class listas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> listaNombres = new ArrayList<String>();
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        listaNombres.add("Andres"); //pos0
        listaNombres.add("Maria"); // pos1
        listaNombres.add("Jose"); //pos2

        //System.out.println(listaNombres);

        //System.out.println("La lista esta vacia? " + listaNombres.isEmpty());

        //System.out.println("En la posicion 1 esta : "+listaNombres.get(1));

        //imprimirLista(listaNombres);
        //	System.out.println("Cual es la pos de Jose? " + listaNombres.indexOf("Jose Andres"));

		/*System.out.println("Ingrese el nombre de la persona a buscar");
		String nombreABuscar = input.nextLine();
		int posABuscar = listaNombres.indexOf(nombreABuscar);
		if (posABuscar == -1) {
			System.out.println("La persona no se encuentra en la lista");
		} else {
			System.out.println("La persona esta en la posicion " + posABuscar);
		}*/

        listaNumeros.add(2);
        listaNumeros.add(4);
        listaNumeros.add(10);

		/*if (esListaEnterosVacia(listaNumeros) == false) {
			int suma = obtenerSumaTotal(listaNumeros);
			System.out.println(" La suma total es  " + suma);
			imprimirListaEnteros(listaNumeros);
		} else {
			System.out.println("La lista esta vacia!! La suma es 0");
		}*/

        int menor = obtenerMenor (listaNumeros);
        System.out.println("El menor numero es " + menor);

    }


    public static void imprimirLista(ArrayList<String> listaStrings) {
        System.out.println("Voy a imprimir los elementos de la lista: ");
        for (int i = 0; i < listaStrings.size(); i++) {
            System.out.println(listaStrings.get(i));
        }
    }

    public static void imprimirListaEnteros(ArrayList<Integer> listaEnteros) {
        System.out.println("Voy a imprimir los elementos de la lista: ");
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
    }


    //Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma.
    public static int cantidadElementos (ArrayList<Integer> listaEnteros) {
        return listaEnteros.size();
    }

    //Método que reciba una lista de enteros, y retorne la verdadero si y sólo si la lista está vacía.
    public static boolean esListaEnterosVacia (ArrayList<Integer> listaEnteros) {

        if (listaEnteros.isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }

    //Método que reciba una lista de enteros, y retorne la suma.
    public static int obtenerSumaTotal (ArrayList<Integer> listaEnteros) {
        int suma = 0;

        for (int i = 0; i < listaEnteros.size(); i++) {
            suma = suma + listaEnteros.get(i);
        }

        return suma;
    }


    //Método que reciba una lista de enteros, y retorne el promedio de los mismos.
    public static float calcularPromedio(ArrayList<Integer> listaNumeros) {
        int sumaTotal = obtenerSumaTotal(listaNumeros);
        float promedio = sumaTotal / listaNumeros.size();
        return promedio;
        //return obtenerSumaTotal(listaNumeros) / listaNumeros.size();
    }

    //Método que reciba una lista de enteros, y retorne el menor.
    // 4 5 1
    public static int obtenerMenor (ArrayList<Integer> listaNumeros) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) < min) {
                min = listaNumeros.get(i);
            }
        }

        return min;
    }

}
