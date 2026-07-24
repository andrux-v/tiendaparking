package Controlador;

import Modelo.ChoferModelo;
import Vista.vista_chofer;

public class controlador_chofer {
    public vista_chofer obj_vista;
    
    public controlador_chofer(vista_chofer obj_vista) {
        this.obj_vista = obj_vista;
    }
    
    public ChoferModelo registrarChofer() {
        return procesar_datos();
    }

    public ChoferModelo procesar_datos() {
        String dato_nombre = this.obj_vista.tomar_nombre();
        String dato_licencia = this.obj_vista.tomar_licencia();
        String dato_cedula = this.obj_vista.tomar_cedula();
        ChoferModelo obj_chofer = new ChoferModelo(dato_nombre, dato_licencia, dato_cedula);
        return obj_chofer;
    }
}
