package ciclo3.grupo2.Controlador;
import java.util.Scanner;
import ciclo3.grupo2.Modelo.CrearNuevoProyecto;

/*
 *La clase ControladorPrincipal recibe la opción que el usuario quiere realizar, la idea es que esta clase llave a otras clases como por ejemplo la clase CrearNuevoProyecto si se ingresa el numero 1 como opción  
 */

public class ControladorPrincipal {
    // La clase Scanner recibe la entrada del usuario
    static Scanner sc = new Scanner(System.in);
    //La variable opcion guarda el contenido ingresado en scanner 
    static int opcion = 0; 

    /*El metodo setOption ejecuta la clase Scanner y guarda la entrada del usuario dentro de la variable opcion
    */
    public static void setOpcion(){ //setter
        opcion = sc.nextInt(); //se guarda la entrada del usuario 
        
        if(opcion == 1){ 
            /*el if evalua el tipo de entrada del usuario para saber 
             * para saber que tipo de codigo debe ejecutarse
            */
            System.out.println("todo bien");
            //dentro del if se deberia ejecutar la clase CrearNuevoProyecto
        } else {
            System.out.println("algo salio mal");
        }
    };

}
