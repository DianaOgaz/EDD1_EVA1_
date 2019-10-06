/*
 * Pase de parametros por valor: Es una copia de la variable que no modifica a la copia.
 * Java solamente maneja paso por valor. 
 * 
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
        
        int iValor = 10;
        System.out.println("Valo = " + iValor);
        incremento(iValor);
        System.out.println("Valor = " +iValor);
       // --------
        Prueba obj = new Prueba();
        obj.iVal = 10;
        System.out.println("Valor = " + obj.iVal);
        incrementooObj(obj);
        System.out.println("Valor = " + obj.iVal);
    }
    public static void incremento(int iVal){
    iVal++;
        System.out.println("Valor = " +iVal);
} 
      public static void incrementooObj(Prueba obj){
    obj.iVal++;
        
}
}
class Prueba{
       int iVal;
}