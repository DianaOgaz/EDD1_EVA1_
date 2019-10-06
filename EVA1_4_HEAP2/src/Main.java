/*
 * Llamada a instancias diferentes que llaman al mismo objeto.
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
    
        Main pObj = new Main();
        System.out.println(pObj);
        foo(pObj);
    }
    
        public static void foo(Main param){
            System.out.println(param);
            
            
            
        
        }
        
    
    
}
