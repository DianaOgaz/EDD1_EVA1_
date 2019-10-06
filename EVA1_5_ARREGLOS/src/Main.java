/*
 * crear un arreglo de 10 elementos con numeros aleatorios.
 * los arreglos son objetos 
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iDatos[] = new int[10]; // Declaracion de arreglo. 
        System.out.println(iDatos); //al imprimir se muestra la direccion. 
        /*corchete = arreglo. I = enteros.
        *requiere 40 bytes para el heap
        */
        //N --> número de elementos
        //0 --> 1er elemento
        //N - 1 --> Ultimo elemento
        System.out.println("For normal");
        for (int i = 0; i < iDatos.length; i++) { //legth regresa cantidad de objetos que hay en el arreglo
            
            iDatos[i] = (int)(Math.random() * 100) + 1; 
            
        }
        for (int i = 0; i < iDatos.length; i++) {
            System.out.println(iDatos[i]); //Variable i es la posicion
            
        }
        //for-each, para cada uno
        System.out.println("For each");
        for (int x : iDatos) { //elemento por elemento
            System.out.println(x);
        }
            //Null es un valor, es como tocar tierra en electricidad
            //en un arreglo todos los bytes deben estar almacenados continuamente
            //tamaño fijo, direcciones continuas, tiene que haber espacio disponible.
        }
    }
    

