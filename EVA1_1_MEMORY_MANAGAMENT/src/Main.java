/*
 * Llamar a una funcion que se llama a si misma hasta llenar la memoria del compilador y 
 * asi crashear el sistema. 
 */

/**
 *
 * @author Diana Teresa Ogaz Escarpita 18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fakeChrome();
    }
    public static void fakeChrome(){
 fakeChrome();
}
}
