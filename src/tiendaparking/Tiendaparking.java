
package tiendaparking;

import Modelo.CarroModelo;
import Modelo.ChoferModelo;


public class Tiendaparking {

    public static void main(String[] args) {
        // codigo principal --> ejecutar todo...
        
        ChoferModelo obj_chofer = new ChoferModelo("Andres" , "Vargas" , "1093298257");
        ChoferModelo obj_chofer2 = new ChoferModelo("Juan" , "Perez" , "1093298256");
        
        obj_chofer.setNombre_chofer("Pedro");
        obj_chofer2.setCedula_chofer("10393433");
        
        String dato_nombre = obj_chofer.getNombre_chofer();
        System.out.println("nombre chofer: " + dato_nombre);
        
        
        CarroModelo obj_carro = new CarroModelo("Audi" , "Negro" , "IFO59E");
        
        obj_carro.setMarca_carro("Toyota");
        
        String dato_marca = obj_carro.getMarca_carro();
        System.out.println("marca auto: " + dato_marca);
        
        
        
    }
    
}
