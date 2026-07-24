
package Modelo;

public class PasajeroModelo {
    
    String cedula_pasajero = "";
    String nombrec_pasajero = "";
    
    public PasajeroModelo(String dato_cedula , String dato_nombrec){
        this.cedula_pasajero = dato_cedula;
        this.nombrec_pasajero = dato_nombrec;
    }

    // Regla de negocio: validar que los datos existan (no nulos ni vacíos)
    public boolean validarPasajero() {
        if (cedula_pasajero == null || cedula_pasajero.equals("")) {
            System.out.println("Error: La cédula del pasajero no existe o está vacía.");
            return false;
        }
        if (nombrec_pasajero == null || nombrec_pasajero.equals("")) {
            System.out.println("Error: El nombre del pasajero no existe o está vacío.");
            return false;
        }
        return true;
    }

    public String getCedula_pasajero() {
        return cedula_pasajero;
    }

    public void setCedula_pasajero(String cedula_pasajero) {
        this.cedula_pasajero = cedula_pasajero;
    }

    public String getNombrec_pasajero() {
        return nombrec_pasajero;
    }

    public void setNombrec_pasajero(String nombrec_pasajero) {
        this.nombrec_pasajero = nombrec_pasajero;
    }
        
}
