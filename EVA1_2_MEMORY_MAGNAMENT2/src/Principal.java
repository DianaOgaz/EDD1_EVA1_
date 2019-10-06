/*
 * recurcibidad de funciones, se acaba la memoria en el stack.
Se crea una excepcion en el programa y falla exitosamente.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        
        fakeCrome();
        
        
    }
    
    public static void fakeCrome(){
        fakeCrome();
                
        
        
    }
    
}
