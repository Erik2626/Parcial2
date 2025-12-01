/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parcial2.Decorator;

import com.mycompany.parcial2.FactoryMethod.ReportePDF;

/**
 *
 * @author nikol y erik
 */
public class MainDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Reporte reporte = (Reporte) new ReportePDF();
        Reporte reporteDecorado = new EncabezadoDecorador(new MarcaAguaDecorador(new PieConFechaDecorador(reporte)));
        System.out.println(reporteDecorado.generarContenido());
    }
}
