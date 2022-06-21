package com.mycompany.reto4;

public class PanelesSolares {
    private int id;
    private char identificador;
    private String tipo;
    private int modelo;
    private int anioFabricacion;
    private double precio;
    
    private PanelesSolares(int id, char identificador, String tipo, int modelo, int anioFabricacion, double precio){
        this.id = id;
        this.identificador = identificador;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }
    
   
}
