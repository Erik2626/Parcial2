/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.FactoryMethod;

/**
 *
 * @author nikol y erik
 */
public class ReporteEXCEL implements Reporte {
    @Override
    public String generarContenido() {
        return "Contenido del reporte en EXCEL";
    }
}