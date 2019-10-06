
import java.util.Scanner;

/*
 * Copia de arreglos.
Se crea un arreglo con 10, y se crea una copia para luego imprimirla
 */

/**
 *
 * @author Invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona iAr[] = new Persona[10];//arreglo que almacena objetos tipo persona (10)
        Scanner sCaptu = new Scanner(System.in);
                for (int i = 0; i < iAr.length; i++) {
                iAr[i] = new Persona();       // declaracio0n del objeto
                    System.out.println("Introduce tu nombre");
                 iAr[i].iNombre = sCaptu.nextLine(); //Usar un objeto que no existe
                 
            
        }
                impArreglo(iAr);
                //COPI --------------------------------------
                Persona[] aCopi = new Persona[iAr.length]; //Mismo tamaño del objeto inicial
                for (int i = 0; i < iAr.length; i++) {
                aCopi[i] = new Persona();     
                aCopi[i].iNombre = iAr[i].iNombre;  
                
        }
    }
    public static void impArreglo(Persona[] args){ //imprimir arreglo de tipo persona (imprimira objetos)
        for (int i = 0; i < args.length; i++) {
            System.out.println("nombre: " + args[i].iNombre);//accede a la ubicacion y con el . accede a la propiedad dentro de la
                                                            // ubicacion
            
        }
        
    }
}
class Persona{
String iNombre;
String iApellido;
}
