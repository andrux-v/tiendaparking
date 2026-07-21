package Vista;

import Controlador.controlador_pasajero;
import java.util.Scanner;

public class vista_pasajero {
    
    public void pedirDatos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cedula del pasajero:");
        String cedula = entrada.nextLine();
        
        System.out.println("Ingrese el nombre completo del pasajero:");
        String nombre = entrada.nextLine();
        
        controlador_pasajero ctrl = new controlador_pasajero();
        String mensaje = ctrl.datosRegistrarPasajero(cedula, nombre);
        
        System.out.println(mensaje);
    }
}
