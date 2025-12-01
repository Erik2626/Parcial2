/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parcial2.FactoryMethod;

/**
 *
 * @author nikol y erik
 */
public class MainFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String tipoUsuario = "PDF"; 
        Reporte reporte = ReporteFactory.crearReporte(tipoUsuario);
        System.out.println(reporte.generarContenido());
    }
}

