package paquete01;

/**
 *
 * @author andreflores
 */
public class Estudiante {

    private String nom;
    private String ap;
    private double calif1;
    private double calif2;
    private double calif3;
    private double promedio;

    public Estudiante(String n, String a, double c1, double c2, double c3) {
        nom = n;
        ap = a;
        calif1 = c1;
        calif2 = c2;
        calif3 = c3;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerAp(String n) {
        ap = n;
    }

    public void establecerCalif_1(double n) {
        calif1 = n;
    }

    public void establecerCalif_2(double n) {
        calif2 = n;
    }

    public void establecerCalif_3(double n) {
        calif3 = n;
    }

    public void calcularPromedio() {
        promedio = (calif1 + calif2 + calif3) / 3;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerAp() {
        return ap;
    }

    public double obtenerCalif_1() {
        return calif1;
    }

    public double obtenerCalif_2() {
        return calif2;
    }

    public double obtenerCalif_3() {
        return calif3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String data = String.format("%s %s\n"
                + "  Calificaciones:\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  Promedio: %.2f\n",
                obtenerNom(),
                obtenerAp(),
                obtenerCalif_1(),
                obtenerCalif_2(),
                obtenerCalif_3(),
                obtenerPromedio());
        return data;
    }
}
