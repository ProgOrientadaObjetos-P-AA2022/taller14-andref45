package paquete01;

/**
 *
 * @author andreflores
 */
public class Trabajador {

    private String ced;
    private String nom;
    private String correo;
    private double sueldo;
    private String mesS;
    
    public Trabajador (String c, String n, String corr, double s, String m){
        ced = c;
        nom = n;
        correo = corr;
        sueldo = s;
        mesS = m;
    }

    public void establecerCedula(String n) {
        ced = n;
    }

    public void establecerNombre(String n) {
        nom = n;
    }

    public void establecerCorreo(String n) {
        correo = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public void establecerMesS(String n) {
        mesS = n;
    }

    public String obtenerCedula() {
        return ced;
    }

    public String obtenerNombre() {
        return nom;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMesS() {
        return mesS;
    }

    @Override
    public String toString() {
        String data = String.format("Nombres: %s\n"
                + "Cédula: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del sueldo: %s\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesS());
        return data;
    }
}
