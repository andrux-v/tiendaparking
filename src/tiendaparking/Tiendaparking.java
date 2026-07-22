package tiendaparking;

import Modelo.CarroModelo;
import Modelo.ChoferModelo;
import Modelo.MotorModelo;
import Modelo.PasajeroModelo;
    
/**
 * Punto de entrada principal de la aplicación TiendaParking.
 */
public class Tiendaparking {

    public static void main(String[] args) {
        
        // Sincronización y uso del Conductor (ChoferModelo)
        ChoferModelo chofer = new ChoferModelo("Carlos", "Gomez", "1122334455");
        chofer.setNombre_chofer("Andres");

        String nombreChofer = chofer.getNombre_chofer();
        System.out.println("Nombre chofer: " + nombreChofer);
        
        // Sincronización y uso del Vehículo (CarroModelo)
        CarroModelo carro = new CarroModelo("Mustang", "Negro", "XJH-1010");
        carro.setPlaca_carro("XJN-1011");

        String placaVehiculo = carro.getPlaca_carro();
        System.out.println("Placa carro: " + placaVehiculo);

        // Sincronización y uso del Motor (MotorModelo)
        MotorModelo motor = new MotorModelo("SN-987654", "Eléctrico");
        motor.setTipo_motor("Eléctrico");

        String tipoDeMotor = motor.getTipo_motor();
        System.out.println("Tipo de motor: " + tipoDeMotor);

        String serialMotor = motor.getNserie_motor();
        System.out.println("Numero de serie del motor: " + serialMotor);

        // Sincronización y uso del Pasajero (PasajeroModelo)
        PasajeroModelo pasajero = new PasajeroModelo("99887755", "Jose Vera");
        pasajero.setNombrec_pasajero("Andres Vera");

        String nombrePasajero = pasajero.getNombrec_pasajero();
        System.out.println("Nombre pasajero: " + nombrePasajero);

        String cedulaPasajero = pasajero.getCedula_pasajero();
        System.out.println("Cedula pasajero: " + cedulaPasajero);
    }
}

