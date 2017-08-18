package com.beeva.app.Entidades;

import java.util.Date;

public class Proyecto_Usuario{
    private String codigoProyecto;
    private int idUsuario;
    private String avitividad;
    private Date fecha;

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getAvitividad() {
        return avitividad;
    }

    public void setAvitividad(String avitividad) {
        this.avitividad = avitividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}