/*
Hay dos maneras de declarar arreglos, los arreglos son rapidos pero no son flexibles
debes cambiar el tamaño. Si se tuvieran que ordenar los datos te meterias en un problema D:
Memoria consecutiva. Acceso aleatorio. ES INMUTABLE, no se cambia el tamaño del arreglo, 
se borra el anterior y se crea uno nuevo.
cada vez que se usa el new se busca espacio para el objeto. 

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
        //aquii hay 4 tipos de arreglos declarados,  SOLO DECLARADOS
        //No ocupan memoria, por lo tanto no existen
        int aiDatos[], a, b;
        int[] iaDatos2, x, y;
        //
        int aiCopia[];
        //inicialixzacion de los arreglos
        aiDatos = new int[100000000]; //Arreglo de tamaño 100, o sea 400 bytes
        //Fore-each
        /*
        for (int i : aiDatos) {
            System.out.println(i);
        }
        */
        
        
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100) +1;
            aiDatos[4] = 5000;
            aiDatos[69] = 500;
            
        }
        
    }
    
}
