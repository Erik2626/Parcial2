/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Singleton;

import com.mycompany.parcial2.Decorator.Reporte;
import com.mycompany.parcial2.Decorator.ReporteDecorador;


/**
 *
 * @author nikol y erik
 */
public class MarcaAguaDecoradorSingleton extends ReporteDecorador{
    public MarcaAguaDecoradorSingleton(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generarContenido() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();

        if (!config.setMostrarMarcaAgua()) {
            return reporte.generarContenido();
        }

        return reporte.generarContenido() +
               "\n[Marca de agua global]";
    }
}
