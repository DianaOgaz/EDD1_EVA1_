/*
 * Cada fila tendra una cantidad diferente de columnas.
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
        
        int aMatriz[][]=new int[2][3];
        int aMatriz2[][];
        aMatriz2 = new int [3][];
        aMatriz2[0]=new int[10]; //Fila cero tendra 10 columnas
        aMatriz2[1]=new int[100]; 
        aMatriz2[2]=new int[24];
   
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                aMatriz[i][j] = (int)(Math.random()*100);
            }
        }
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("[" + aMatriz[i][j] + "]"); //imprime todo seguido
                
            }
            System.out.println("");
    }
    
}
}