/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresainfor;

/**
 *Clase cliente de la empresa que contiene todos los datos del cliente
 * @author sergioarnaiz
 */
public class Cliente {
    Fecha fecha =new Fecha();
    private String nombre;
    private String cif;
    private Fecha fechaFactura;
    private Fecha fechaVencimiento;
    private int importeFactura;
    private int importeneto;
/**
 * Constructor de la clase cliente
 * @param nombre nombre del cliente
 * @param cif cif del cliente
 * @param fechaFactura fecha de la factura del cliente
 * @param fechaVencimiento fecha de vencimiento de la factura del cliente
 * @param importeFactura importe bruto de la factura
 * @param importeneto importe neto de la factura del cliente
 */
    public Cliente(String nombre, String cif, Fecha fechaFactura, Fecha fechaVencimiento, int importeFactura, int importeneto) {
        this.nombre = nombre;
        this.cif = cif;
        this.fechaFactura = fechaFactura;
        this.fechaVencimiento = fechaVencimiento;
        this.importeFactura = importeFactura;
        this.importeneto=importeneto;
    }
/**
 * Obtiene el nombre del cliente
 * @return nombre del cliente
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Obtiene el cif del cliente
 * @return cif del cliente
 */
    public String getCif() {
        return cif;
    }
/**
 * Obtiene la fecha de la factura del cliente
 * @return fechaFactura del cliente
 */
    public Fecha getFechaFactura() {
        return fechaFactura;
    }
/**
 * Obtiene la fecha de vencimiento de la factura del cliente
 * @return fechaVencimiento de la factura
 */
    public Fecha getDiasVencimiento() {
        return fechaVencimiento;
    }
/**
 * Obitene el importe bruto de la factura 
 * @return importeFactura importe bruto de la factura
 */
    public int getImporteFactura() {
        return importeFactura;
    }
    /**
     * Obtiene el importe neto de la factura
     * @return importeneto de la factura
     */
    public int getimporteNeto(){
    return importeneto;
    
    }
}
