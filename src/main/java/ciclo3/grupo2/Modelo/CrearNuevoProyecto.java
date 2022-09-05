package ciclo3.grupo2.Modelo;

import javax.swing.JOptionPane;
public class CrearNuevoProyecto {
    final private int idProyecto;
    private static int idSiguiente = 1;
    private String nombreProyecto;
    private String descripcionProyecto;
    private String fechaInicioProyecto;
    private String estado;

    public CrearNuevoProyecto(){
        idProyecto = idSiguiente;
        idSiguiente++;

        this.nombreProyecto = JOptionPane.showInputDialog("Ingresa el nombre del proyecto: ");

        this.descripcionProyecto = JOptionPane.showInputDialog("Ingresa una descripción del proyecto: ");

        this.fechaInicioProyecto = JOptionPane.showInputDialog("Ingresa una fecha de inicio para el proyecto: ");

        this.estado = JOptionPane.showInputDialog("Ingresa el estado del proyecto: ");
    }

    public int getIdProyecto(){
        return idProyecto;

    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getEstado(){
        return estado;
    }

    public void setNombreProyecto(){
        this.nombreProyecto = JOptionPane.showInputDialog("Ingresa el nombre del proyecto: ");
    }
    
    public void setDescripcion() {
        this.descripcionProyecto = JOptionPane.showInputDialog("Ingresa una descripción del proyecto: ");
    }

    public void setFecha() {
        this.fechaInicioProyecto = JOptionPane.showInputDialog("Ingresa una fecha de inicio para el proyecto: ");
    }

    public void setEstado() {
        this.estado = JOptionPane.showInputDialog("Ingresa el estado del proyecto: ");
    }


    public String mostrarDetalles(){
        return  "Id proyecto: \t" + idProyecto + "\n" + 
                "Nombre: \t" + nombreProyecto + "\n" +
                "Descripción: \t" + descripcionProyecto + "\n" + 
                "Fecha de inicio: \t" + fechaInicioProyecto + "\n" +
                "Estado: \t" + estado;
    }
}