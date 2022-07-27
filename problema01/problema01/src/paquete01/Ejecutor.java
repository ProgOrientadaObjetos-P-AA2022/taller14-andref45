package paquete01;

import java.util.Scanner;
import java.sql.SQLException;
/**
 *
 * @author andreflores
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Scanner entrada = new Scanner(System.in);
        String ced, nom, correo, mes;
        double sueldo;
        
        boolean bandera = true;
        String cadena = "";
        do {
            System.out.println("Ingrese la cédula:");
            ced = entrada.nextLine();
            System.out.println("Ingrese los nombres:");
            nom = entrada.nextLine();
            System.out.println("Ingrese el correo:");
            correo = entrada.nextLine();
            System.out.println("Ingrese el sueldo:");
            sueldo = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el mes del sueldo:");
            mes = entrada.nextLine();

            Trabajador t = new Trabajador(ced, nom, correo, sueldo, mes);
            
            c.insertarTrabajador(t);
            System.out.println("Ingrese SI para salir del proceso");
            String op = entrada.nextLine();
            
            cadena = String.format("%s%s\n",cadena, t);
            if ("SI".equals(op) || "Si".equals(op)) {
                bandera = false;
                System.out.println(cadena);
            }
        } while (bandera);

    }

}
