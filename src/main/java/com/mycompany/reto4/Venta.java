package com.mycompany.reto4;

import java.time.Duration;
import java.time.LocalDateTime;

public class Venta {
    private int idPanel;
    private LocalDateTime fechaHora;
    private String tipoDocumento;
    private int numDocumento;
    private String nombreCliente;
    private int valorPagar;
    private String descripcion;

    public Venta(int idPanel, LocalDateTime fechaHora, String tipoDocumento, int numDocumento, String nombreCliente, int valorPagar, String descripcion) {
        this.idPanel = idPanel;
        this.fechaHora = fechaHora;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombreCliente = nombreCliente;
        this.valorPagar = valorPagar;
        this.descripcion = descripcion;
    }
    
    public int calcularDiasVenta(){
        Duration diasVenta = Duration.between(fechaHora, LocalDateTime.now()); 
        return (int) diasVenta.toDays();
    }

    public int getIdPanel() {
        return idPanel;
    }

    public void setIdPanel(int idPanel) {
        this.idPanel = idPanel;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Venta{" + "idPanel=" + idPanel + ", fechaHora=" + fechaHora + ", tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + ", nombreCliente=" + nombreCliente + ", valorPagar=" + valorPagar + ", descripcion=" + descripcion + '}';
    }
    
    
}
