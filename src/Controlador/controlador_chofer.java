package Controlador;

import Modelo.ChoferModelo;
import Vista.vista_chofer;

public class controlador_chofer {
    public vista_chofer obj_vista;
    public controlador_chofer (vista_chofer obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public void procesar_datos(){
        String dato_nombre = this.obj_vista.tomar_nombre();
        String dato_licencia = this.obj_vista.tomar_licencia();
        String dato_cedula = this.obj_vista.tomar_cedula();
        ChoferModelo obj_chofer = new ChoferModelo (dato_nombre, dato_licencia, dato_cedula);
        obj_chofer.setNombre_chofer(dato_nombre);
        obj_chofer.setLicencia_chofer(dato_licencia);
        obj_chofer.setCedula_chofer(dato_cedula);
    }
}
