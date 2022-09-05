package ciclo3.grupo2.Modelo;

import javax.swing.JOptionPane;

import ciclo3.grupo2.Controlador.ControladorPrincipal;

public class EditarTarea {

    public static void editar() {
        EditarTarea.mostrarTareas();

        int idProyecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id de la tarea que desea editar: "));

        for (int i = 0; i < ControladorPrincipal.listaProyectos.size(); i++) {

            if (idProyecto == ControladorPrincipal.listaProyectos.get(i).getIdProyecto()) {
                ControladorPrincipal.listaProyectos.get(i).setNombreProyecto();
                ControladorPrincipal.listaProyectos.get(i).setDescripcion();
                ControladorPrincipal.listaProyectos.get(i).setFecha();
                ControladorPrincipal.listaProyectos.get(i).setEstado();
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
