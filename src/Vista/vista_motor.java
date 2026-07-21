package Vista;

import Controlador.controlador_motor;
import java.util.Scanner;

public class vista_motor {
    
    public void pedirDatos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de serie del motor:");
        String nserie = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de motor:");
        String tipo = entrada.nextLine();
        
        controlador_motor ctrl = new controlador_motor();
        String mensaje = ctrl.datosRegistrarMotor(nserie, tipo);
        
        System.out.println(mensaje);
    }
}
