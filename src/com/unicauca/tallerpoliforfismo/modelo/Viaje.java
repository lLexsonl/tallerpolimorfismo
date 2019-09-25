/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.tallerpoliforfismo.modelo;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public abstract class Viaje {
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;

// Constructores, getters y setters
    
    public Viaje(){this("","",0,new Date(), new Date());}
    public Viaje(String origen, String destino, int costo, Date fSalida, Date fLlegada){
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fSalida;
        this.fechaLlegada = fLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    public abstract String descripcion();
    
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }
}
