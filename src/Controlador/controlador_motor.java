package Controlador;

import Modelo.MotorModelo;
import Vista.vista_motor;

public class controlador_motor {
    public vista_motor obj_vista;
    
    public controlador_motor(vista_motor obj_vista) {
        this.obj_vista = obj_vista;
    }

    public MotorModelo registrarMotor() {
        return procesar_datos();
    }
    
    public MotorModelo procesar_datos() {
        String dato_nserie = this.obj_vista.tomar_nserie();
        String dato_tipo = this.obj_vista.tomar_tipo();
        MotorModelo obj_motor = new MotorModelo(dato_nserie, dato_tipo);
        return obj_motor;
    }
}

