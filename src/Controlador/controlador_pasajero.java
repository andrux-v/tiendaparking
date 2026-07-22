package Controlador;

import Modelo.PasajeroModelo;
import Vista.vista_pasajero;

public class controlador_pasajero {
    public vista_pasajero obj_vista;
    public controlador_pasajero (vista_pasajero obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public void procesar_datos(){
        String dato_cedula = this.obj_vista.tomar_cedula();
        String dato_nombrec = this.obj_vista.tomar_nombrec();
        PasajeroModelo obj_pasajero = new PasajeroModelo (dato_cedula, dato_nombrec);
        obj_pasajero.setCedula_pasajero(dato_cedula);
        obj_pasajero.setNombrec_pasajero(dato_nombrec);
    }
}

