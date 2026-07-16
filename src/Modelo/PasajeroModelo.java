
package Modelo;

public class PasajeroModelo {
    
    String cedula_pasajero = "";
    String nombrec_pasajero = "";
    
    public PasajeroModelo(String dato_cedula , String dato_nombrec){
        this.cedula_pasajero = dato_cedula;
        this.nombrec_pasajero = dato_nombrec;
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
