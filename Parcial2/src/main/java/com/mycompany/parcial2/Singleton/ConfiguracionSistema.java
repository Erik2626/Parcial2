/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Singleton;

/**
 *
 * @author nikol y erik
 */
public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String directorioSalida;
    private String formatoPorDefecto;
    private boolean mostrarMarcaAgua;

    private ConfiguracionSistema() {

        directorioSalida = "reportes";
        formatoPorDefecto = "PDF";
        mostrarMarcaAgua = true;
    }

    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }


    public String getDirectorioSalida() {
        return directorioSalida;
    }

    public void setDirectorioSalida(String directorioSalida) {
        this.directorioSalida = directorioSalida;
    }

    public String getFormatoPorDefecto() {
        return formatoPorDefecto;
    }

    public void setFormatoPorDefecto(String formatoPorDefecto) {
        this.formatoPorDefecto = formatoPorDefecto;
    }

    public boolean setMostrarMarcaAgua() {
        return mostrarMarcaAgua;
    }

    public void setMostrarMarcaAgua(boolean mostrarMarcaAgua) {
        this.mostrarMarcaAgua = mostrarMarcaAgua;
    }
}
