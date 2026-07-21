package Controlador;

import Modelo.PasajeroModelo;

public class controlador_pasajero {

    public String datosRegistrarPasajero(String cedula, String nombre) {
        PasajeroModelo obj_pasajero = new PasajeroModelo(cedula, nombre);

        return "Pasajero registrado correctamente:\n"
                + "Pasajero: " + obj_pasajero.getNombrec_pasajero() + "\n"
                + "Cedula: " + obj_pasajero.getCedula_pasajero();
    }
}

