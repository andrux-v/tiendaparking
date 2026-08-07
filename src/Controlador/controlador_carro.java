package Controlador;

import Modelo.CarroModelo;
import Interfaces.VistaCarro;
import Interfaces.VistaControl;
import Modelo.ApiModelo;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class controlador_carro {
    public VistaCarro obj_vista;
    private ApiModelo api;
    private VistaControl vistaControl;
    
    public controlador_carro(VistaCarro obj_vista, ApiModelo api, VistaControl vistaControl) {
        this.obj_vista = obj_vista;
        this.api = api;
        this.vistaControl = vistaControl;
        
        this.obj_vista.getJButton1().addActionListener(e -> registrarCarro());
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
    
    public void registrarCarro() {
        String marca = this.obj_vista.getJTextField1().getText().trim();
        String color = this.obj_vista.getJTextField2().getText().trim();
        String placa = this.obj_vista.getJTextField3().getText().trim();

        if (marca.isEmpty() || color.isEmpty() || placa.isEmpty()) {
            JOptionPane.showMessageDialog(obj_vista, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!marca.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: La marca solo debe contener letras.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!color.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: El color solo debe contener letras.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!placa.matches("[a-zA-Z0-9-]+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: La placa solo debe contener letras y números.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        CarroModelo obj_carro = new CarroModelo(marca, color, placa);
        api.agregarCarro(obj_carro);
        JOptionPane.showMessageDialog(obj_vista, "Carro registrado con éxito!");
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