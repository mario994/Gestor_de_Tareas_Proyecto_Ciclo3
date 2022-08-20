package ciclo3.grupo2.Vista;
import ciclo3.grupo2.Controlador.ControladorPrincipal;
/*
 VistaPrincipal: Esta clase solamente representa la parte visual de la aplicación.
*/
public class VistaPrincipal {

    public VistaPrincipal() {
        System.out.println("---------------------------------------------------------");
        System.out.println("BIENVENIDO AL SISTEMA DE GESTOR DE TAREAS VERSION 1.0");
        System.out.println("---------------------------------------------------------\n");
        System.out.println("¿Que acción deseas realizar?\n");
        System.out.println("1 Crear nueva tarea");
        System.out.println("2 Mostrar las tareas existentes");
        System.out.println("3 Editar una tarea");
        System.out.println("4 Eliminar una tarea");
        System.out.println("5 Salir del programa");
        System.out.print("\n");
        System.out.println("---------------------------------------------------------");
        
        /*Una vez ejecutada la parte visual, inmediatamente se ejecuta 
         * el metodo estatico de la clase controlador principal
         */
        ControladorPrincipal.setOpcion();
    }
}
