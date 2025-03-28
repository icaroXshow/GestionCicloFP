import java.util.ArrayList;

/**
 * Clase que representa un ciclo formativo.
 */
public class Ciclo {
    private String nombreCiclo;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    /**
     * Constructor que inicializa el ciclo con su nombre.
     *
     * @param nombreCiclo Nombre del ciclo.
     */
    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    /**
     * Agrega un estudiante al ciclo.
     *
     * @param estudiante El estudiante a agregar.
     */
    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    /**
     * Retorna los datos del ciclo y los estudiantes matriculados.
     *
     * @return Información del ciclo y sus estudiantes.
     */
    public String getDatosCiclo() {
        String datos = "Ciclo: " + nombreCiclo + "\nEstudiantes:\n";
        // Recorre la lista de estudiantes y añade sus datos a la cadena final.
        for (Estudiante estudiante : listaEstudiantes) {
            datos += estudiante.getDatosEstudiante() + "\n";
        }
        return datos;
    }

    /**
     * Obtiene el nombre del ciclo.
     *
     * @return El nombre del ciclo.
     */
    public String getNombreCiclo() {
        return nombreCiclo;
    }
}
