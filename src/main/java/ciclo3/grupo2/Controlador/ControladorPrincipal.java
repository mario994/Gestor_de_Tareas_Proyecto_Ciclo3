package ciclo3.grupo2.Controlador;

import java.util.ArrayList;
import java.util.Scanner;
import ciclo3.grupo2.Modelo.CrearNuevoProyecto;
import ciclo3.grupo2.Modelo.EditarTarea;
import ciclo3.grupo2.Modelo.EliminarTarea;

public class ControladorPrincipal {
    private static Scanner sc = new Scanner(System.in);
    private static int opcion = 0; 
    public static ArrayList<CrearNuevoProyecto> listaProyectos = new ArrayList<CrearNuevoProyecto>();

    public static void setOpcion(){ 
        opcion = sc.nextInt();

        if(opcion == 1){ 
            try {
                listaProyectos.add(new CrearNuevoProyecto());
                System.out.println("---------------------------------------------------------");
                System.out.println("Se ha agregado una nueva tarea");
                System.out.println("---------------------------------------------------------\n");
            } catch (Exception e) {
                System.out.println("---------------------------------------------------------");
                System.out.println("ERROR al momento de agregar la tarea");
                System.out.println("---------------------------------------------------------\n");
            }

        } else if(opcion == 2){
            if(!listaProyectos.isEmpty()){
                for (int i = 0; i < listaProyectos.size(); i++) {
                    System.out.println(listaProyectos.get(0).mostrarDetalles());
                }
                System.out.println("---------------------------------------------------------");
            }else{
                System.out.println("---------------------------------------------------------");
                System.out.println("No se ha creado ninguna tarea");
                System.out.println("---------------------------------------------------------\n");
            }

        } else if(opcion == 3){

            EditarTarea.editar();

        } else if(opcion == 4){

            EliminarTarea.eliminar();
            
        }
    };

    public static int getOpcion(){
        return opcion;
    }

}
