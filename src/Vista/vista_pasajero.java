package Vista;

import java.util.Scanner;

public class vista_pasajero {
    
    public String tomar_cedula (){
        Scanner teclado = new Scanner (System.in);
        String cedula = teclado.next();
        return cedula;
    }
    
    public String tomar_nombrec (){
        Scanner teclado = new Scanner (System.in);
        String nombrec = teclado.next();
        return nombrec;
    }
}
