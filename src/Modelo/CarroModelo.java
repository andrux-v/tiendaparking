
package Modelo;

public class CarroModelo {

    String marca_carro = "";
    String color_carro = "";
    String placa_carro = "";

    public CarroModelo(String dato_marca, String dato_color, String dato_placa) {

        this.marca_carro = dato_marca;
        this.color_carro = dato_color;
        this.placa_carro = dato_placa;
    }

    public String getMarca_carro() {
        return marca_carro;
    }

    public void setMarca_carro(String marca_carro) {
        this.marca_carro = marca_carro;
    }

    public String getColor_carro() {
        return color_carro;
    }

    public void setColor_carro(String color_carro) {
        this.color_carro = color_carro;
    }

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }

    // Regla de negocio: validar que los datos existan (no nulos ni vacíos)
    public boolean validarCarro() {
        if (marca_carro == null || marca_carro.equals("")) {
            return false;
        }
        if (color_carro == null || color_carro.equals("")) {
            return false;
        }
        if (placa_carro == null || placa_carro.equals("")) {
            return false;
        }
        return true;
    }

    public boolean buscar_placa(String info_placa) {
        return this.placa_carro.equalsIgnoreCase(info_placa);
    }
}
