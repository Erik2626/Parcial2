/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Decorator;

/**
 *
 * @author nikol y erik
 */
public class MarcaAguaDecorador extends ReporteDecorador {

    public MarcaAguaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generarContenido() {
        return reporte.generarContenido() + "\n[Marca de agua]";
    }
}
