
package Modelo;

public class MotorModelo {
    
    String nserie_motor = "";
    String tipo_motor = "";
    
    public MotorModelo(String dato_nserie, String dato_tipo){
        this.nserie_motor = dato_nserie;
        this.tipo_motor = dato_tipo;
    }

    // Regla de negocio: validar que los datos existan (no nulos ni vacíos)
    public boolean validarMotor() {
        if (nserie_motor == null || nserie_motor.equals("")) {
            System.out.println("Error: El número de serie del motor no existe o está vacío.");
            return false;
        }
        if (tipo_motor == null || tipo_motor.equals("")) {
            System.out.println("Error: El tipo de motor no existe o está vacío.");
            return false;
        }
        return true;
    }

    // Regla de negocio sencilla: verificar si el motor es ecológico
    public boolean esEcologico() {
        if (tipo_motor.equalsIgnoreCase("Electrico") || tipo_motor.equalsIgnoreCase("Hibrido")) {
            return true;
        } else {
            return false;
        }
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
