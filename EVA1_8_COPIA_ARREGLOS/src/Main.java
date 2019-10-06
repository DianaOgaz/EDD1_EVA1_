/*
 Copia de arreglo pero en este caso ambos son totalmente diferentes porque no se copió
la direccion, se modifico su posicion. 
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
    
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        
       
        for (int i = 0; i < aiDatos.length; i++) {
           aiDatos[i] = (int)(Math.random()*100) +1;
        }
        aiDatos[0] = 99999; 
        imprimirArreglo(aiDatos); 
        imprimirArreglo(aiCopia);
        System.out.println(aiDatos);
            System.out.println(aiCopia);
            
    }
        public static void imprimirArreglo(int[] args){   
        System.out.println("");
        for (int i = 0; i < args.length; i++) {
            System.out.println("[" + args[i] + "]");
            
            
        }
    }
}