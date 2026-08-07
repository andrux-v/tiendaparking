package Controlador;

import Interfaces.VistaControl;
import Interfaces.VistaChofer;
import Interfaces.VistaCarro;
import Interfaces.VistaMotor;
import Interfaces.VistaPasajero;
import Modelo.ApiModelo;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlador_general {
    
    public VistaControl vistaControl;
    private ApiModelo api;
    
    public controlador_chofer ctrlChofer;
    public controlador_carro ctrlCarro;
    public controlador_motor ctrlMotor;
    public controlador_pasajero ctrlPasajero;

    public controlador_general(VistaControl vistaControl, VistaChofer vistaChofer, VistaCarro vistaCarro, VistaMotor vistaMotor, VistaPasajero vistaPasajero) {
        this.vistaControl = vistaControl;
        
        // Inicializando la "Base de Datos" (API)
        this.api = new ApiModelo("localhost", "root", "1234");

        this.ctrlChofer = new controlador_chofer(vistaChofer, this.api, this.vistaControl);
        this.ctrlCarro = new controlador_carro(vistaCarro, this.api, this.vistaControl);
        this.ctrlMotor = new controlador_motor(vistaMotor, this.api, this.vistaControl);
        this.ctrlPasajero = new controlador_pasajero(vistaPasajero, this.api, this.vistaControl);
        
        // Configurar botones de VistaControl
        this.vistaControl.getJButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaChofer.setLocationRelativeTo(null);
                vistaChofer.setVisible(true);
                vistaControl.setVisible(false);
            }
        });
        this.vistaControl.getJButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCarro.setLocationRelativeTo(null);
                vistaCarro.setVisible(true);
                vistaControl.setVisible(false);
            }
        });
        this.vistaControl.getJButton3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaMotor.setLocationRelativeTo(null);
                vistaMotor.setVisible(true);
                vistaControl.setVisible(false);
            }
        });
        this.vistaControl.getJButton4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaPasajero.setLocationRelativeTo(null);
                vistaPasajero.setVisible(true);
                vistaControl.setVisible(false);
            }
        });
    }

    public void iniciarSistema() {
        this.vistaControl.setLocationRelativeTo(null);
        this.vistaControl.setVisible(true);
    }
}
