/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.tallerpoliforfismo.modelo;

import java.util.Date;

/**
 *
 * @author yerson
 */
public class ViajeTodoIncluido extends Viaje{

    public ViajeTodoIncluido(String origen, String destino, int costo, Date fSalida, Date fLlegada) {
        super(origen, destino, costo, fSalida, fLlegada);
    }
    
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
}
