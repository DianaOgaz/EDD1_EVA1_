/*
 * Cada corchete en un arreglo se hace un arreglo multidimensional. Pueden agragarce 3 o más.
fila y columna en relacion al orden de los corchetes.

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
        
        //arreglo de dos simensiones ---> matriz Dx
        int aDatos[][] = new int [3][4];  //Primero filas y luego columnas, por cadsa fila tres columnas
        System.out.println("Direccion de arreglo: " + aDatos);
        System.out.println("Tamaño de arreglo: " + aDatos.length);
        System.out.println("Direccion de arreglo[0]: " + aDatos[0]); // Arreglo de enteros 
        System.out.println("Tamaño de arreglo: " + aDatos[0].length); 
        
         System.out.println("Valor de la posicion de arreglo[0][0]: " + aDatos[0][0]);
       // System.out.println("Tamaño de arreglo: " + aDatos[0][0].length); no porque es un entero
    }
    
}
