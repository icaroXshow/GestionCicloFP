import java.util.ArrayList;

/**
 * Clase para gestionar ciclos y la matriculación de estudiantes.
 */
public class GestionCicloFP {
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Ciclo> listaCiclos = new ArrayList<>();

    /**
     * Agrega un nuevo estudiante a la lista.
     *
     * @param nombre Nombre del estudiante.
     * @param id     Identificador del estudiante.
     * @param edad   Edad del estudiante.
     */
    public void agregarEstudiante(String nombre, int id, int edad) {
        listaEstudiantes.add(new Estudiante(nombre, id, edad));
    }

    /**
     * Agrega un nuevo ciclo a la lista.
     *
     * @param nombreCiclo Nombre del ciclo.
     */
    public void agregarCiclo(String nombreCiclo) {
        listaCiclos.add(new Ciclo(nombreCiclo));
    }

    /**
     * Matricula a un estudiante en un ciclo.
     *
     * @param idEstudiante Identificador del estudiante.
     * @param nombreCiclo  Nombre del ciclo en el que se matriculará el estudiante.
     */
    public void matricularEstudiante(int idEstudiante, String nombreCiclo) {
        Estudiante estudianteEncontrado = null;
        Ciclo cicloEncontrado = null;

        // Buscar el estudiante por su id
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdEstudiante() == idEstudiante) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        // Buscar el ciclo por su nombre
        for (Ciclo ciclo : listaCiclos) {
            if (ciclo.getNombreCiclo().equals(nombreCiclo)) {
                cicloEncontrado = ciclo;
                break;
            }
        }

        // Si se encuentran tanto el estudiante como el ciclo, se realiza la matriculación
        if (estudianteEncontrado != null && cicloEncontrado != null) {
            cicloEncontrado.agregarEstudiante(estudianteEncontrado);
        }
    }

    /**
     * Muestra la información de todos los ciclos.
     */
    public void mostrarCiclos() {
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.getDatosCiclo());
        }
    }

    /**
     * Método principal para ejecutar el programa.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricularEstudiante(1, "DAW");
        gestion.matricularEstudiante(2, "ASIR");

        gestion.mostrarCiclos();
    }
}

