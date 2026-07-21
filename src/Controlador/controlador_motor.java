package Controlador;

import Modelo.MotorModelo;

public class controlador_motor {

    public String datosRegistrarMotor(String nserie, String tipo) {
        MotorModelo obj_motor = new MotorModelo(nserie, tipo);
        
        return "Motor registrado correctamente:\n"
                + "No. Serie: " + obj_motor.getNserie_motor() + "\n"
                + "Tipo: " + obj_motor.getTipo_motor();
    }
}

