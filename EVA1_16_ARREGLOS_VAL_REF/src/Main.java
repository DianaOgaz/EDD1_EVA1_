/*
 *Los arreglos son objetos por eso es posible usar funciones para modificarlo.
 * Crear copia de lo que le mandan y puede acceder a modificarlos, puede cambiar el objeto pero no
 * la direccion.
 * Paso por valor, enviar una copia, al tratar de modificar solo se modifica la copia.
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
        
        int aArreglo[] = new int [10];
        System.out.println(aArreglo);
        llenarArreglo(aArreglo);
        fakinArreglo(aArreglo);
        System.out.println(aArreglo);
        impArreglo(aArreglo);
        
    }
    public static void llenarArreglo(int[] arre){
        
        for (int i = 0; i < arre.length; i++) {
            arre[i]= (int)(Math.random()*100);
        }
        System.out.println(arre);
    } 
    public static void impArreglo(int[] arre){
        
        for (int i = 0; i < arre.length; i++) {
            System.out.print("["+ arre[i]+ "]"); //no olvidar quitar el "ln" del sout para iniciar una nueva linea
        }
        System.out.println("");
    } 
    public static void fakinArreglo(int[]arre){
        arre = new int [100];
        System.out.println(arre);
}
}
