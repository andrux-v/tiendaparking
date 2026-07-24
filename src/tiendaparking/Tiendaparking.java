package tiendaparking;

import Vista.vista_chofer;
import Vista.vista_carro;
import Vista.vista_motor;
import Vista.vista_pasajero;

import Controlador.controlador_chofer;
import Controlador.controlador_carro;
import Controlador.controlador_motor;
import Controlador.controlador_pasajero;

public class Tiendaparking {

    public static void main(String[] args) {

        System.out.println("=== REGISTRO DE CHOFER ===");
        vista_chofer vista_chofer = new vista_chofer();
        controlador_chofer obj_controlador = new controlador_chofer(vista_chofer);
        obj_controlador.registrarChofer();

        System.out.println("\n=== REGISTRO DE CARRO ===");
        vista_carro vista_carro = new vista_carro();
        controlador_carro obj_carro_ctrl = new controlador_carro(vista_carro);
        obj_carro_ctrl.registrarCarro();

        System.out.println("\n=== REGISTRO DE MOTOR ===");
        vista_motor vista_motor = new vista_motor();
        controlador_motor obj_motor_ctrl = new controlador_motor(vista_motor);
        obj_motor_ctrl.registrarMotor();

        System.out.println("\n=== REGISTRO DE PASAJERO ===");
        vista_pasajero vista_pasajero = new vista_pasajero();
        controlador_pasajero obj_pasajero_ctrl = new controlador_pasajero(vista_pasajero);
        obj_pasajero_ctrl.registrarPasajero();
    }
}

