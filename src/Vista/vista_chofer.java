package Vista;

import Controlador.controlador_chofer;
import java.util.Scanner;

public class vista_chofer {
    
    public void pedirDatos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del chofer:");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del chofer:");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese la cedula del chofer:");
        String cedula = entrada.nextLine();
        
        controlador_chofer ctrl = new controlador_chofer();
        String mensaje = ctrl.datosRegistrarChofer(nombre, apellido, cedula);
        
        System.out.println(mensaje);
    }
}
