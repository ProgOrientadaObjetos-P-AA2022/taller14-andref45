package paquete01;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace c = new Enlace();
        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            System.out.printf("%s", c.obtenerDataEstudiante().get(i));
        }
    }

}
