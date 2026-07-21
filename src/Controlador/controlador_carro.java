package Controlador;

import Modelo.CarroModelo;

public class controlador_carro {

    public String datosRegistrarCarro(String marca, String color, String placa) {
        CarroModelo obj_carro = new CarroModelo(marca, color, placa);
        
        return "Carro registrado correctamente:\n"
                + "Marca: " + obj_carro.getMarca_carro() + "\n"
                + "Color: " + obj_carro.getColor_carro() + "\n"
                + "Placa: " + obj_carro.getPlaca_carro();
    }
}