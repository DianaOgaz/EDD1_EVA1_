/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        int aMati [][] = new int [3][5]; //se necesitaran dos for
        for (int i = 0; i < aMati.length; i++) { //contando filas
            for (int j = 0; j < aMati[i].length; j++) {
                aMati[i][j] = (int)(Math.random()* 100);
                
            }
    
        }
        //IMPRIMIR
        for (int i = 0; i < aMati.length; i++) {
            for (int j = 0; j < aMati[i].length; j++) {
                System.out.print("[" + aMati[i][j] + "]"); //imprime todo seguido
                
            }
            System.out.println(""); //brinca linea
        }
                
    }
    
}
