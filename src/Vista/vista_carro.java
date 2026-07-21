package Vista;

import Controlador.controlador_carro;
import java.util.Scanner;

public class vista_carro {
    
    public void pedirDatos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la marca del carro:");
        String marca = entrada.nextLine();
        
        System.out.println("Ingrese el color del carro:");
        String color = entrada.nextLine();
        
        System.out.println("Ingrese la placa del carro:");
        String placa = entrada.nextLine();
        
        controlador_carro ctrl = new controlador_carro();
        String mensaje = ctrl.datosRegistrarCarro(marca, color, placa);
        
        System.out.println(mensaje);
    }
}

