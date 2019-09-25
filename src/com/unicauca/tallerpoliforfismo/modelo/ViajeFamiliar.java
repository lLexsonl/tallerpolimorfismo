/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.tallerpoliforfismo.modelo;

import java.util.Date;

/**
 *
 * @author Yerson .
 */
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    //Constructor getters and setters
    public ViajeFamiliar(String origen, String destino, int costo, Date fSalida, Date fLlegada, int cantFamilia) {
        super(origen, destino, costo, fSalida, fLlegada);
        this.familia = cantFamilia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
}
