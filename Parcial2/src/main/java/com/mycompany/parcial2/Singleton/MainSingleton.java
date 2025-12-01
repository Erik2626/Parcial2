/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parcial2.Singleton;

import com.mycompany.parcial2.Decorator.EncabezadoDecorador;
import com.mycompany.parcial2.Decorator.MarcaAguaDecorador;
import com.mycompany.parcial2.Decorator.PieConFechaDecorador;
import com.mycompany.parcial2.FactoryMethod.Reporte;
import com.mycompany.parcial2.FactoryMethod.ReporteFactory;

/**
 *
 * @author nikol y erik
 */
public class MainSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        config.setFormatoPorDefecto("PDF");
        Reporte reporte = ReporteFactory.crearReporte(config.getFormatoPorDefecto());
        reporte = (Reporte) new EncabezadoDecorador(new MarcaAguaDecorador(new PieConFechaDecorador((com.mycompany.parcial2.Decorator.Reporte) reporte)));
        System.out.println(reporte.generarContenido());
    }
    
}
