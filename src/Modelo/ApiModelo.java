
package Modelo;

import java.util.List;
import java.util.ArrayList;

public class ApiModelo {
    
    String clave="";
    String root="";
    String url="";
    
    // Estructuras dinámicas
    private List<ChoferModelo> listaChoferes = new ArrayList<>();
    private List<PasajeroModelo> listaPasajeros = new ArrayList<>();
    
    // Estructuras estáticas
    private CarroModelo[][] matrizCarros = new CarroModelo[3][3];
    private MotorModelo[][] matrizMotores = new MotorModelo[3][3];
    
    public ApiModelo(String url, String usuario, String clave){
        this.clave = clave;
        this.root = usuario;
        this.url = url;           
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public boolean validar_conexion(){
        if (this.clave.equals("1234")) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean desconexion(){
        return true;
    }
    
    public boolean buscar_chofer(String info_cedula){
        for (int i = 0; i < listaChoferes.size(); i++) {
            if (listaChoferes.get(i).getCedula_chofer().equals(info_cedula)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean buscar_pasajero(String info_cedula){
        for (int i = 0; i < listaPasajeros.size(); i++) {
            if (listaPasajeros.get(i).getCedula_pasajero().equals(info_cedula)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean buscar_carro(String info_placa){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizCarros[i][j] != null && matrizCarros[i][j].buscar_placa(info_placa)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean buscar_motor(String info_nserie){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizMotores[i][j] != null && matrizMotores[i][j].getNserie_motor().equals(info_nserie)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void agregarChofer(ChoferModelo chofer) {
        if (chofer != null && chofer.validarChofer()) {
            listaChoferes.add(chofer);
        }
    }
    
    public void agregarPasajero(PasajeroModelo pasajero) {
        if (pasajero != null && pasajero.validarPasajero()) {
            listaPasajeros.add(pasajero);
        }
    }
    
    public void agregarCarro(CarroModelo carro) {
        if (carro != null && carro.validarCarro()) {
            boolean guardado = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrizCarros[i][j] == null) {
                        matrizCarros[i][j] = carro;
                        guardado = true;
                        break;
                    }
                }
                if (guardado) break;
            }
            if (!guardado) {
                System.out.println("No hay espacio disponible para más carros en la matriz 3x3.");
            }
        }
    }
    
    public void agregarMotor(MotorModelo motor) {
        if (motor != null && motor.validarMotor()) {
            boolean guardado = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrizMotores[i][j] == null) {
                        matrizMotores[i][j] = motor;
                        guardado = true;
                        break;
                    }
                }
                if (guardado) break;
            }
            if (!guardado) {
                System.out.println("No hay espacio disponible para más motores en la matriz 3x3.");
            }
        }
    }
    
    public String obtenerTodosLosRegistros() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- CHOFERES REGISTRADOS ---\n");
        for (ChoferModelo c : listaChoferes) {
            sb.append("- Nombre: ").append(c.getNombre_chofer())
              .append(" | Cédula: ").append(c.getCedula_chofer())
              .append(" | Licencia: ").append(c.getLicencia_chofer()).append("\n");
        }
        if (listaChoferes.isEmpty()) sb.append("Ninguno.\n");
        
        sb.append("\n--- PASAJEROS REGISTRADOS ---\n");
        for (PasajeroModelo p : listaPasajeros) {
            sb.append("- Nombre: ").append(p.getNombrec_pasajero())
              .append(" | Cédula: ").append(p.getCedula_pasajero()).append("\n");
        }
        if (listaPasajeros.isEmpty()) sb.append("Ninguno.\n");
        
        sb.append("\n--- CARROS REGISTRADOS (Matriz 3x3) ---\n");
        boolean hayCarros = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizCarros[i][j] != null) {
                    CarroModelo c = matrizCarros[i][j];
                    sb.append("- [").append(i).append("][").append(j).append("] ")
                      .append("Marca: ").append(c.getMarca_carro())
                      .append(" | Placa: ").append(c.getPlaca_carro())
                      .append(" | Color: ").append(c.getColor_carro()).append("\n");
                    hayCarros = true;
                }
            }
        }
        if (!hayCarros) sb.append("Ninguno.\n");
        
        sb.append("\n--- MOTORES REGISTRADOS (Matriz 3x3) ---\n");
        boolean hayMotores = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizMotores[i][j] != null) {
                    MotorModelo m = matrizMotores[i][j];
                    sb.append("- [").append(i).append("][").append(j).append("] ")
                      .append("Tipo: ").append(m.getTipo_motor())
                      .append(" | Serie: ").append(m.getNserie_motor())
                      .append(" | Cilindraje: ").append(m.getCilindraje()).append("\n");
                    hayMotores = true;
                }
            }
        }
        if (!hayMotores) sb.append("Ninguno.\n");
        
        return sb.toString();
    }
}