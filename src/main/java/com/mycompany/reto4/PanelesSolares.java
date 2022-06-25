package com.mycompany.reto4;

import java.time.LocalDate;

public class PanelesSolares {
    private int id;
    private char identificador;
    private String tipo;
    private char modelo;
    private int anioFabricacion;
    private double precio;
    
    
    private PanelesSolares(int id, char identificador, String tipo, char modelo, int anioFabricacion, double precio, int existencias){
        this.id = id; // pasar el id manualmente en la creacion de cada objeto
        this.identificador = identificador;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        
    }
    
    public String calcularAntiguedad(){
        int fechaActual = LocalDate.now().getYear();
        int antiguedad = fechaActual - anioFabricacion;
        if(antiguedad >= 0 && antiguedad <= 1){
            String mensaje1 = "Nuevo";
            return mensaje1;
        }else if(antiguedad >= 2 && antiguedad <= 4){
            String mensaje2 = "Medianamente usado";
            return mensaje2;
        }else if(antiguedad >= 5){
            String mensaje3 = "Usado";
            return mensaje3;
        }else{
            String mensajeError = "Año de fabricacion incorrecto";
            return mensajeError;
        }
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getIdentificador() {
        return identificador;
    }

    public void setIdentificador(char identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public char getModelo() {
        return modelo;
    }

    public void setModelo(char modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PanelesSolares{" + "id=" + id + ", identificador=" + identificador + ", tipo=" + tipo + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", precio=" + precio + '}';
    }
    
    
   
}
