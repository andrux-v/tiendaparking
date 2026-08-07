package Controlador;

import Modelo.PasajeroModelo;
import Interfaces.VistaPasajero;
import Interfaces.VistaControl;
import Modelo.ApiModelo;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class controlador_pasajero {
    public VistaPasajero obj_vista;
    private ApiModelo api;
    private VistaControl vistaControl;
    
    public controlador_pasajero(VistaPasajero obj_vista, ApiModelo api, VistaControl vistaControl) {
        this.obj_vista = obj_vista;
        this.api = api;
        this.vistaControl = vistaControl;
        
        this.obj_vista.getJButton1().addActionListener(e -> registrarPasajero());
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
    
    public void registrarPasajero() {
        String cedula = this.obj_vista.getJTextField1().getText().trim();
        String nombre = this.obj_vista.getJTextField2().getText().trim();

        if (cedula.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(obj_vista, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cedula.matches("\\d+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: La cédula solo debe contener números.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: El nombre completo solo debe contener letras.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PasajeroModelo obj_pasajero = new PasajeroModelo(nombre, cedula);
        api.agregarPasajero(obj_pasajero);
        JOptionPane.showMessageDialog(obj_vista, "Pasajero registrado con éxito!");
        limpiarFormulario();
    }

    public void limpiarFormulario() {
        this.obj_vista.getJTextField1().setText("");
        this.obj_vista.getJTextField2().setText("");
    }
    
    public void mostrarRegistros() {
        String registros = api.obtenerTodosLosRegistros();
        JOptionPane.showMessageDialog(obj_vista, registros.isEmpty() ? "No hay registros guardados." : registros, "Registros", JOptionPane.INFORMATION_MESSAGE);
    }
}
