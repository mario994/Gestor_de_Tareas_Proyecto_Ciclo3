package ciclo3.grupo2.Modelo;
/*
 * La clase CrearNuevoProyecto se encarga de crear un objeto con los
 * datos ingresados, en este caso crea una nueva tarea
 */
public class CrearNuevoProyecto {
    private int idProyecto;
    private String nombreProyecto;
    private String descripcionProyecto;
    private String fechaInicioProyecto;
    private String estado;

    //constructor para settear los valores iniciales de las variables
    public CrearNuevoProyecto(int idProyecto, String nombreProyecto, String descripcionProyecto, String fechaInicioProyecto, String estado){
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.fechaInicioProyecto = fechaInicioProyecto;
        this.estado = estado;
    }

    //metdodo para mostrar las tareas creadas todavia no funciona correctamente
    public String mostrarDetalles(){
        return "id proyecto " + idProyecto + " Nombre: " + nombreProyecto + " Descripción: " + descripcionProyecto + " fecha de inicio: " + fechaInicioProyecto + " estado: " + estado;
    }

}