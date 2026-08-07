package tiendaparking;

import Interfaces.VistaControl;
import Interfaces.VistaChofer;
import Interfaces.VistaCarro;
import Interfaces.VistaMotor;
import Interfaces.VistaPasajero;
import Controlador.controlador_general;

public class Tiendaparking {

    public static void main(String[] args) {
        // Establecer el LookAndFeel para que se vea moderno
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Tiendaparking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Crear instancias de las vistas JFrames
        VistaControl vistaControl = new VistaControl();
        VistaChofer vistaChofer = new VistaChofer();
        VistaCarro vistaCarro = new VistaCarro();
        VistaMotor vistaMotor = new VistaMotor();
        VistaPasajero vistaPasajero = new VistaPasajero();

        // Inicializar el controlador principal y conectar las vistas
        controlador_general ctrlGeneral = new controlador_general(
                vistaControl, vistaChofer, vistaCarro, vistaMotor, vistaPasajero
        );
        
        // Iniciar el sistema
        ctrlGeneral.iniciarSistema();
    }
}