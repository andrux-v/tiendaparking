package Controlador;

import Modelo.ChoferModelo;

public class controlador_chofer {

    public String datosRegistrarChofer(String nombre, String apellido, String cedula) {
        ChoferModelo obj_chofer = new ChoferModelo(nombre, apellido, cedula);
        
        return "Chofer registrado correctamente:\n"
                + "Nombre: " + obj_chofer.getNombre_chofer() + "\n"
                + "Apellido: " + obj_chofer.getApellido_chofer() + "\n"
                + "Cedula: " + obj_chofer.getCedula_chofer();
    }
}
