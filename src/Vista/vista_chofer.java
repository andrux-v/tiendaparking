package Vista;

public class vista_chofer {
    
    public String tomar_nombre() {
        System.out.print("Ingrese nombre del chofer: ");
        String nombre = Teclado.scanner.next();
        while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            System.out.print("Error: El nombre solo debe contener letras.\nIngrese nombre del chofer nuevamente: ");
            nombre = Teclado.scanner.next();
        }
        return nombre;
    }
    
    public String tomar_licencia() {
        System.out.print("Ingrese licencia del chofer: ");
        String licencia = Teclado.scanner.next();
        while (!licencia.matches("[a-zA-Z0-9-]+")) {
            System.out.print("Error: La licencia solo debe contener letras o números.\nIngrese licencia del chofer nuevamente: ");
            licencia = Teclado.scanner.next();
        }
        return licencia;
    }
    
    public String tomar_cedula() {
        System.out.print("Ingrese cédula del chofer: ");
        String cedula = Teclado.scanner.next();
        while (!cedula.matches("\\d+")) {
            System.out.print("Error: La cédula solo debe contener números.\nIngrese cédula del chofer nuevamente: ");
            cedula = Teclado.scanner.next();
        }
        return cedula;
    }
}
