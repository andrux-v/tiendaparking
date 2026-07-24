package Vista;

public class vista_pasajero {
    
    public String tomar_cedula() {
        System.out.print("Ingrese cédula del pasajero: ");
        String cedula = Teclado.scanner.next();
        while (!cedula.matches("\\d+")) {
            System.out.print("Error: La cédula solo debe contener números.\nIngrese cédula del pasajero nuevamente: ");
            cedula = Teclado.scanner.next();
        }
        return cedula;
    }
    
    public String tomar_nombrec() {
        System.out.print("Ingrese nombre del pasajero: ");
        String nombrec = Teclado.scanner.next();
        while (!nombrec.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            System.out.print("Error: El nombre solo debe contener letras.\nIngrese nombre del pasajero nuevamente: ");
            nombrec = Teclado.scanner.next();
        }
        return nombrec;
    }
}
