package com.beeva.app.Entidades;

import java.util.Date;

public class Proyecto{

    private String codigoproyecto;
    private String elementopep;
    private String nombreproyecto;
    private String responsableproyecto;
    private String fechainicio;
    private String fechafin;
    private String estatus;
    private int posicion;
    private double presupuesto;
    private double disponible;
    private String codigocompra;
    private String codigoorden;
    private String tipo;

    public String getCodigoproyecto() {
        return codigoproyecto;
    }

    public void setCodigoproyecto(String codigoproyecto) {
        this.codigoproyecto = codigoproyecto;
    }

    public String getElementopep() {
        return elementopep;
    }

    public void setElementopep(String elementopep) {
        this.elementopep = elementopep;
    }

    public String getNombreproyecto() {
        return nombreproyecto;
    }

    public void setNombreproyecto(String nombreproyecto) {
        this.nombreproyecto = nombreproyecto;
    }

    public String getResponsableproyecto() {
        return responsableproyecto;
    }

    public void setResponsableproyecto(String responsableproyecto) {
        this.responsableproyecto = responsableproyecto;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getDisponible() {
        return disponible;
    }

    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    public String getCodigocompra() {
        return codigocompra;
    }

    public void setCodigocompra(String codigocompra) {
        this.codigocompra = codigocompra;
    }

    public String getCodigoorden() {
        return codigoorden;
    }

    public void setCodigoorden(String codigoorden) {
        this.codigoorden = codigoorden;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}