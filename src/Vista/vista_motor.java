package Vista;

import java.util.Scanner;

public class vista_motor {
    
    public String tomar_nserie (){
        Scanner teclado = new Scanner (System.in);
        String nserie = teclado.next();
        return nserie;
    }
    
    public String tomar_tipo (){
        Scanner teclado = new Scanner (System.in);
        String tipo = teclado.next();
        return tipo;
    }
}
