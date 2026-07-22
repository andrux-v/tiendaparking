package Vista;

import java.util.Scanner;

public class vista_carro {
    
    public String tomar_marca (){
        Scanner teclado = new Scanner (System.in);
        String marca = teclado.next();
        return marca;
    }
    
    public String tomar_color (){
        Scanner teclado = new Scanner (System.in);
        String color = teclado.next();
        return color;
    }
    
    public String tomar_placa (){
        Scanner teclado = new Scanner (System.in);
        String placa = teclado.next();
        return placa;
    }
}

