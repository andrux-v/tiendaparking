
package Modelo;

public class ChoferModelo {

    private String nombre_chofer = "";
    String licencia_chofer = "";
    String cedula_chofer = "";

    public ChoferModelo(String dato_nombre, String dato_licencia, String dato_cedula) {
        this.nombre_chofer = dato_nombre;
        this.licencia_chofer = dato_licencia;
        this.cedula_chofer = dato_cedula;
    }

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

    public String getLicencia_chofer() {
        return licencia_chofer;
    }

    public void setLicencia_chofer(String licencia_chofer) {
        this.licencia_chofer = licencia_chofer;
    }

    public String getCedula_chofer() {
        return cedula_chofer;
    }

    public void setCedula_chofer(String cedula_chofer) {
        this.cedula_chofer = cedula_chofer;
    }

    // Regla de negocio: validar que los datos existan (no nulos ni vacíos)
    public boolean validarChofer() {
        if (nombre_chofer == null || nombre_chofer.equals("")) {
            System.out.println("Error: El nombre del chofer no existe o está vacío.");
            return false;
        }
        if (licencia_chofer == null || licencia_chofer.equals("")) {
            System.out.println("Error: La licencia del chofer no existe o está vacía.");
            return false;
        }
        if (cedula_chofer == null || cedula_chofer.equals("")) {
            System.out.println("Error: La cédula del chofer no existe o está vacía.");
            return false;
        }
        return true;
    }
}
