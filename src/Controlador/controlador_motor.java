package Controlador;

import Modelo.MotorModelo;
import Vista.vista_motor;

public class controlador_motor {
    public vista_motor obj_vista;
    public controlador_motor (vista_motor obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public void procesar_datos(){
        String dato_nserie = this.obj_vista.tomar_nserie();
        String dato_tipo = this.obj_vista.tomar_tipo();
        MotorModelo obj_motor = new MotorModelo (dato_nserie, dato_tipo);
        obj_motor.setNserie_motor(dato_nserie);
        obj_motor.setTipo_motor(dato_tipo);
    }
}

