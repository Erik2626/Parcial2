/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Singleton;

import com.mycompany.parcial2.FactoryMethod.Reporte;
import com.mycompany.parcial2.FactoryMethod.ReporteEXCEL;
import com.mycompany.parcial2.FactoryMethod.ReporteHTML;
import com.mycompany.parcial2.FactoryMethod.ReportePDF;

/**
 *
 * @author nikol y erik
 */
public class ReporteFactorySingleton {
    public static Reporte crearReporte(String tipo) {

        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("Usando directorio de salida" + config.getDirectorioSalida());

        switch (tipo.toLowerCase()) {
            case "PDF": return new ReportePDF();
            case "EXCEL": return new ReporteEXCEL();
            case "HTML": return new ReporteHTML();
            default: throw new IllegalArgumentException("Formato no encontrado" + tipo);
        }
    }
}
