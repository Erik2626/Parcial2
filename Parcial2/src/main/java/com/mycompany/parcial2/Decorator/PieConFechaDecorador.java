/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Decorator;

/**
 *
 * @author nikol y erik
 */
public class PieConFechaDecorador extends ReporteDecorador {

    public PieConFechaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generarContenido() {
        return reporte.generarContenido() + "\nFecha de generación";
    }
}