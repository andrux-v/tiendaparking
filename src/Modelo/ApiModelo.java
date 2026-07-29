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
}