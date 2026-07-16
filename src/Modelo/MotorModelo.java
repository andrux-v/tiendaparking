
package Modelo;

public class MotorModelo {
    
    String nserie_motor = "";
    String tipo_motor = "";
    
    public MotorModelo(String dato_nserie, String dato_tipo){
        this.nserie_motor = dato_nserie;
        this.tipo_motor = dato_tipo;
    }

    public String getNserie_motor() {
        return nserie_motor;
    }

    public void setNserie_motor(String nserie_motor) {
        this.nserie_motor = nserie_motor;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    
}
