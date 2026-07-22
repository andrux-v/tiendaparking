package Vista;

import Controlador.controlador_chofer;
import java.util.Scanner;

public class vista_chofer {
    
    public String tomar_nombre (){
        Scanner teclado = new Scanner (System.in);
        String nombre = teclado.next();
        return nombre;
    }
    
    public String tomar_licencia (){
        Scanner teclado = new Scanner (System.in);
        String licencia = teclado.next();
        return licencia;
    }
    
    public String tomar_cedula (){
        Scanner teclado = new Scanner (System.in);
        String cedula = teclado.next();
        return cedula;
    }
}
