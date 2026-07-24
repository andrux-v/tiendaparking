package Controlador;

import Modelo.PasajeroModelo;
import Vista.vista_pasajero;

public class controlador_pasajero {
    public vista_pasajero obj_vista;
    
    public controlador_pasajero(vista_pasajero obj_vista) {
        this.obj_vista = obj_vista;
    }

    public PasajeroModelo registrarPasajero() {
        return procesar_datos();
    }
    
    public PasajeroModelo procesar_datos() {
        String dato_cedula = this.obj_vista.tomar_cedula();
        String dato_nombrec = this.obj_vista.tomar_nombrec();
        PasajeroModelo obj_pasajero = new PasajeroModelo(dato_cedula, dato_nombrec);
        return obj_pasajero;
    }
}

