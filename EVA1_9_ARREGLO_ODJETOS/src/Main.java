/*
 Null pointer exception, leer un objeto no indicado
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
    
        Prueba apArreglo[] =  new Prueba[5];//No se crea objeto solo arreglo
        Prueba apCopia[] = new Prueba[5];
        
        for (int i = 0; apArreglo.length < 10; i++) {
            
            apArreglo = new apCopia[i];
            System.out.println("Arreglo" + apArreglo[i]);         
            System.out.println("Copia" + apCopia[i]);         
            
        } 
        for (int i = 0; apArreglo.length < 10; i++) {
            
            apArreglo[i] = new Prueba();
            System.out.println(apArreglo[i]);   
            apArreglo[i].x = (int)(Math.random()*100)
            
            
            
        }
    }
    
}
class Prueba{
int x;    
    
}

