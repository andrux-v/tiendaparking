package Vista;

public class vista_general {
    
    public vista_chofer vistaChofer;
    public vista_carro vistaCarro;
    public vista_motor vistaMotor;
    public vista_pasajero vistaPasajero;

    public vista_general() {
        this.vistaChofer = new vista_chofer();
        this.vistaCarro = new vista_carro();
        this.vistaMotor = new vista_motor();
        this.vistaPasajero = new vista_pasajero();
    }

    public void mostrarTitulo(String titulo) {
        System.out.println("\n=== " + titulo + " ===");
    }
}
