package ciclo3.grupo2.Modelo;

import javax.swing.JOptionPane;
import ciclo3.grupo2.Controlador.ControladorPrincipal;

public class EliminarTarea {
    
    public static void eliminar() {
        EliminarTarea.mostrarTareas();

        int idProyecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id de la tarea que desea eliminar: "));

        for (int i = 0; i < ControladorPrincipal.listaProyectos.size(); i++) {

            if (idProyecto == ControladorPrincipal.listaProyectos.get(i).getIdProyecto()) {
                ControladorPrincipal.listaProyectos.remove(
                    ControladorPrincipal.listaProyectos.get(i)
                );
            }
        }
    }

    private static void mostrarTareas() {
        for (int i = 0; i < ControladorPrincipal.listaProyectos.size(); i++) {
            System.out.println("Id\t" + "Nombre\t" + "Estado\t");

            System.out.println(
                    ControladorPrincipal.listaProyectos.get(i).getIdProyecto() + "\t" +
                            ControladorPrincipal.listaProyectos.get(i).getNombreProyecto() + "\t" +
                            ControladorPrincipal.listaProyectos.get(i).getEstado());
        }
    }
}
