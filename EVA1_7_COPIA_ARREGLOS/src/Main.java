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
          
        
        
        int aiDatos[];
        int aiCopia[] = new int[10];
//inicializacion de los arreglos
        aiDatos = new int[10]; //Arreglo de tamaño 100, o sea 400 bytes
       
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100) +1;
            
        }
        System.out.println("Datos originales");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]");
    }
        System.out.println(aiDatos);
        aiCopia = aiDatos;
        System.out.println(aiCopia);
          System.out.println("Datos Copia");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.print("[" + aiCopia[i] + "]");
    }
        //Dos variables que apuntan al mismo objeto, es copia, si modificas copia, 
        //modificas el original.
}
}
