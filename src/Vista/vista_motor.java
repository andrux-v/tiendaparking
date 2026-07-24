package Vista;

public class vista_motor {
    
    public String tomar_nserie() {
        System.out.print("Ingrese número de serie del motor: ");
        String nserie = Teclado.scanner.next();
        while (!nserie.matches("[a-zA-Z0-9-]+")) {
            System.out.print("Error: El número de serie solo debe contener letras o números.\nIngrese número de serie del motor nuevamente: ");
            nserie = Teclado.scanner.next();
        }
        return nserie;
    }
    
    public String tomar_tipo() {
        System.out.print("Ingrese tipo de motor (Electrico/Gasolina/Hibrido/Diesel): ");
        String tipo = Teclado.scanner.next();
        while (!tipo.equalsIgnoreCase("Electrico") && 
               !tipo.equalsIgnoreCase("Gasolina") && 
               !tipo.equalsIgnoreCase("Hibrido") && 
               !tipo.equalsIgnoreCase("Diesel")) {
            System.out.print("Error: Tipo no válido. Debe ser Electrico, Gasolina, Hibrido o Diesel.\nIngrese tipo de motor nuevamente: ");
            tipo = Teclado.scanner.next();
        }
        return tipo;
    }
}
