/*
 * Llamada a Main (clase principal) Los objetos creados se van al Heap, 
las llamadas y sout's al stack.
Un objeto de tipo principal almacenado en "tal". Direccion de la memoria dentro de la
maquina virtual.
varibles locales y main al stack.
new objet (intancias) se GUARDA LA DIRECCION en el stack, pero el espacio del objeto en
el heap.
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
        
        int i = 10;
        Main pObj = new Main();
        System.out.println(i);
        System.out.println(pObj);
        // impriime la direccion del objeto en el stack, pero el objeto en sí esta en el heap.
        // se le llama REFERENCIAS o PUNTADORES.
        //para borrar la instancia en el heap, solo hay que borrar la llamada en el codigo. (izi)
        pObj = null; // <-- así se borra en el heap :D
        
    }
    
}
