/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.FactoryMethod;

/**
 *
 * @author nikol y erik
 */
public class ReporteFactory {

    public static Reporte crearReporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "PDF":
                return new ReportePDF();
            case "EXCEL":
                return new ReporteEXCEL();
            case "HTML":
                return new ReporteHTML();
            default:
                throw new IllegalArgumentException("Formato no encontrado" + tipo);
        }
    }
}
