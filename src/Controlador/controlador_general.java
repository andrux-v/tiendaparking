package Controlador;

import Vista.vista_general;
import Modelo.ApiModelo;


public class controlador_general {
    
    public vista_general objVistaGeneral;
    private ApiModelo api;
    
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
        
        // Inicializando la "Base de Datos" (API)
        this.api = new ApiModelo("localhost", "root", "1234");
    }

    public void iniciarSistema() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar Chofer");
            System.out.println("2. Registrar Carro");
            System.out.println("3. Registrar Motor");
            System.out.println("4. Registrar Pasajero");
            System.out.println("5. Mostrar Registros Guardados");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            
            String opcionStr = Vista.Teclado.scanner.next();
            
            switch (opcionStr) {
                case "1":
                    this.objVistaGeneral.mostrarTitulo("REGISTRO DE CHOFER");
                    this.api.agregarChofer(this.ctrlChofer.registrarChofer());
                    break;
                case "2":
                    this.objVistaGeneral.mostrarTitulo("REGISTRO DE CARRO");
                    this.api.agregarCarro(this.ctrlCarro.registrarCarro());
                    break;
                case "3":
                    this.objVistaGeneral.mostrarTitulo("REGISTRO DE MOTOR");
                    this.api.agregarMotor(this.ctrlMotor.registrarMotor());
                    break;
                case "4":
                    this.objVistaGeneral.mostrarTitulo("REGISTRO DE PASAJERO");
                    this.api.agregarPasajero(this.ctrlPasajero.registrarPasajero());
                    break;
                case "5":
                    this.objVistaGeneral.mostrarInformacion(this.api.obtenerTodosLosRegistros());
                    break;
                case "6":
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
