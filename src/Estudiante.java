/**
 * Clase que representa a un estudiante.
 */
public class Estudiante {
    private String nombreEstudiante;
    private int idEstudiante;
    private int edadEstudiante;

    /**
     * Constructor para inicializar un estudiante.
     *
     * @param nombreEstudiante Nombre del estudiante.
     * @param idEstudiante     Identificador único del estudiante.
     * @param edadEstudiante   Edad del estudiante.
     */
    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
    }

    /**
     * Retorna los datos del estudiante en formato String.
     *
     * @return Información del estudiante.
     */
    public String getDatosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }

    /**
     * Obtiene el identificador del estudiante.
     *
     * @return El ID del estudiante.
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }
}
