package Controlador;

import Modelo.MotorModelo;
import Interfaces.VistaMotor;
import Interfaces.VistaControl;
import Modelo.ApiModelo;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class controlador_motor {
    public VistaMotor obj_vista;
    private ApiModelo api;
    private VistaControl vistaControl;
    
    public controlador_motor(VistaMotor obj_vista, ApiModelo api, VistaControl vistaControl) {
        this.obj_vista = obj_vista;
        this.api = api;
        this.vistaControl = vistaControl;
        
        this.obj_vista.getJButton1().addActionListener(e -> registrarMotor());
        this.obj_vista.getJButton2().addActionListener(e -> limpiarFormulario());
        this.obj_vista.getJButton3().addActionListener(e -> mostrarRegistros());
        
        this.obj_vista.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        this.obj_vista.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                obj_vista.setVisible(false);
                vistaControl.setVisible(true);
            }
        });
    }
    
    public void registrarMotor() {
        String nserie = this.obj_vista.getJTextField1().getText().trim();
        String tipo = this.obj_vista.getJTextField2().getText().trim();
        String cilindraje = this.obj_vista.getJTextField3().getText().trim();

        if (nserie.isEmpty() || tipo.isEmpty() || cilindraje.isEmpty()) {
            JOptionPane.showMessageDialog(obj_vista, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nserie.matches("[a-zA-Z0-9-]+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: El # de serie debe contener letras o números.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!tipo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: El tipo de motor solo debe contener letras.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cilindraje.matches("\\d+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: El cilindraje solo debe contener números.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        MotorModelo obj_motor = new MotorModelo(nserie, tipo, cilindraje);
        api.agregarMotor(obj_motor);
        JOptionPane.showMessageDialog(obj_vista, "Motor registrado con éxito!");
        limpiarFormulario();
    }

    public void limpiarFormulario() {
        this.obj_vista.getJTextField1().setText("");
        this.obj_vista.getJTextField2().setText("");
        this.obj_vista.getJTextField3().setText("");
    }
    
    public void mostrarRegistros() {
        String registros = api.obtenerTodosLosRegistros();
        JOptionPane.showMessageDialog(obj_vista, registros.isEmpty() ? "No hay registros guardados." : registros, "Registros", JOptionPane.INFORMATION_MESSAGE);
    }
}
