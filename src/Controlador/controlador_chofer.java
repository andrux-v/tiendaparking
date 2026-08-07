package Controlador;

import Modelo.ChoferModelo;
import Interfaces.VistaChofer;
import Interfaces.VistaControl;
import Modelo.ApiModelo;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class controlador_chofer {
    public VistaChofer obj_vista;
    private ApiModelo api;
    private VistaControl vistaControl;
    
    public controlador_chofer(VistaChofer obj_vista, ApiModelo api, VistaControl vistaControl) {
        this.obj_vista = obj_vista;
        this.api = api;
        this.vistaControl = vistaControl;
        
        // Listeners de botones
        this.obj_vista.getJButton1().addActionListener(e -> registrarChofer());
        this.obj_vista.getJButton2().addActionListener(e -> limpiarFormulario());
        
        // Configurar cierre de ventana para volver a VistaControl
        this.obj_vista.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        this.obj_vista.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                obj_vista.setVisible(false);
                vistaControl.setVisible(true);
            }
        });
        
        // Listener para JTextField3
        this.obj_vista.getJTextField3().setEditable(false);
        this.obj_vista.getJTextField3().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarRegistros();
            }
        });
    }
    
    public void registrarChofer() {
        String nombre = this.obj_vista.getJTextField1().getText().trim();
        String cedula = this.obj_vista.getJTextField2().getText().trim();
        String licencia = this.obj_vista.getJComboBox1().getSelectedItem().toString();

        if (nombre.isEmpty() || cedula.isEmpty() || licencia.equals("Elige tu licencia")) {
            JOptionPane.showMessageDialog(obj_vista, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: El nombre solo debe contener letras o espacios.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cedula.matches("\\d+")) {
            JOptionPane.showMessageDialog(obj_vista, "Error: La cédula solo debe contener números.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ChoferModelo obj_chofer = new ChoferModelo(nombre, licencia, cedula);
        api.agregarChofer(obj_chofer);
        JOptionPane.showMessageDialog(obj_vista, "Chofer registrado con éxito!");
        limpiarFormulario();
    }

    public void limpiarFormulario() {
        this.obj_vista.getJTextField1().setText("");
        this.obj_vista.getJTextField2().setText("");
        this.obj_vista.getJComboBox1().setSelectedIndex(0);
    }
    
    public void mostrarRegistros() {
        String registros = api.obtenerTodosLosRegistros();
        JOptionPane.showMessageDialog(obj_vista, registros.isEmpty() ? "No hay registros guardados." : registros, "Registros", JOptionPane.INFORMATION_MESSAGE);
    }
}
