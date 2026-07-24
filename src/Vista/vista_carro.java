package Vista;

public class vista_carro {
    
    public String tomar_marca() {
        System.out.print("Ingrese marca del carro: ");
        String marca = Teclado.scanner.next();
        while (!marca.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            System.out.print("Error: La marca solo debe contener letras.\nIngrese marca del carro nuevamente: ");
            marca = Teclado.scanner.next();
        }
        return marca;
    }
    
    public String tomar_color() {
        System.out.print("Ingrese color del carro: ");
        String color = Teclado.scanner.next();
        while (!color.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            System.out.print("Error: El color solo debe contener letras.\nIngrese color del carro nuevamente: ");
            color = Teclado.scanner.next();
        }
        return color;
    }
    
    public String tomar_placa() {
        System.out.print("Ingrese placa del carro: ");
        String placa = Teclado.scanner.next();
        while (!placa.matches("[a-zA-Z0-9-]+")) {
            System.out.print("Error: La placa solo debe contener letras y números.\nIngrese placa del carro nuevamente: ");
            placa = Teclado.scanner.next();
        }
        return placa;
    }
}

