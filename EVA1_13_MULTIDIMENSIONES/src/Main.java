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
        int aMati[][][][][] = new int [1][2][3][4][5];
        for (int i = 0; i < aMati.length; i++) {
            for (int j = 0; j < aMati[i].length; j++) {
                for (int k = 0; k < aMati[i][j].length; k++) {
                    for (int l = 0; l <aMati[i][j][k].length; l++) {
                        for (int m = 0; m < aMati[i][j][k][l].length; m++) {
                           aMati[i][j][k][l][m] = (int)(Math.random()* 1000);
                            
                        }
                    }
                }
            }
        }
        
        //IMPRIMIR----------------------------------------------------------------
        for (int i = 0; i < aMati.length; i++) {
            for (int j = 0; j < aMati[i].length; j++) {
                for (int k = 0; k < aMati[i][j].length; k++) {
                    for (int l = 0; l <aMati[i][j][k].length; l++) {
                        for (int m = 0; m < aMati[i][j][k][l].length; m++) {
                           aMati[i][j][k][l][m] = (int)(Math.random()* 1000);
                            
                        }
                    }
                }
            }
        }
        
    }
    
}
