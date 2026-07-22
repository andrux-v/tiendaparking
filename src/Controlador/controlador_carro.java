package Controlador;

import Modelo.CarroModelo;
import Vista.vista_carro;

public class controlador_carro {
    public vista_carro obj_vista;
    public controlador_carro (vista_carro obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public void procesar_datos(){
        String dato_marca = this.obj_vista.tomar_marca();
        String dato_color = this.obj_vista.tomar_color();
        String dato_placa = this.obj_vista.tomar_placa();
        CarroModelo obj_carro = new CarroModelo (dato_marca, dato_color, dato_placa);
        obj_carro.setMarca_carro(dato_marca);
        obj_carro.setColor_carro(dato_color);
        obj_carro.setPlaca_carro(dato_placa);
    }
}