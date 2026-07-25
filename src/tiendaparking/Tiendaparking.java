package tiendaparking;

import Vista.vista_general;
import Controlador.controlador_general;

public class Tiendaparking {

    public static void main(String[] args) {
        vista_general vistaGeneral = new vista_general();
        controlador_general ctrlGeneral = new controlador_general(vistaGeneral);

        ctrlGeneral.registrarTodo();
    }
}

