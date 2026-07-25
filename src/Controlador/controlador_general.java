package Controlador;

import Vista.vista_general;

public class controlador_general {
    
    public vista_general objVistaGeneral;
    
    public controlador_chofer ctrlChofer;
    public controlador_carro ctrlCarro;
    public controlador_motor ctrlMotor;
    public controlador_pasajero ctrlPasajero;

    public controlador_general(vista_general objVistaGeneral) {
        this.objVistaGeneral = objVistaGeneral;
        
        this.ctrlChofer = new controlador_chofer(this.objVistaGeneral.vistaChofer);
        this.ctrlCarro = new controlador_carro(this.objVistaGeneral.vistaCarro);
        this.ctrlMotor = new controlador_motor(this.objVistaGeneral.vistaMotor);
        this.ctrlPasajero = new controlador_pasajero(this.objVistaGeneral.vistaPasajero);
    }

    public void registrarTodo() {
        this.objVistaGeneral.mostrarTitulo("REGISTRO DE CHOFER");
        this.ctrlChofer.registrarChofer();

        this.objVistaGeneral.mostrarTitulo("REGISTRO DE CARRO");
        this.ctrlCarro.registrarCarro();

        this.objVistaGeneral.mostrarTitulo("REGISTRO DE MOTOR");
        this.ctrlMotor.registrarMotor();

        this.objVistaGeneral.mostrarTitulo("REGISTRO DE PASAJERO");
        this.ctrlPasajero.registrarPasajero();
    }
}
