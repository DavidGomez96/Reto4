package com.mycompany.reto4;

public class Venta {
    private int idPanel;
    private String fecha;
    private String hora;
    private String tipoDocumento;
    private int numDocumento;
    private String nombreCliente;
    private int valorPagar;
    private String descripcion;

    public Venta(int idPanel, String fecha, String hora, String tipoDocumento, int numDocumento, String nombreCliente, int valorPagar, String descripcion) {
        this.idPanel = idPanel;
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombreCliente = nombreCliente;
        this.valorPagar = valorPagar;
        this.descripcion = descripcion;
    }
    
    
}
