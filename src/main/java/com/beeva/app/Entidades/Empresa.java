package com.beeva.app.Entidades;

public class Empresa{
    private String codigoEmpresa;
    private String nombreEmpresa;
    private String estatusEmpresa;
    private double tarifaGeneral;
    private int idMoneda;

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getEstatusEmpresa() {
        return estatusEmpresa;
    }

    public void setEstatusEmpresa(String estatusEmpresa) {
        this.estatusEmpresa = estatusEmpresa;
    }

    public double getTarifaGeneral() {
        return tarifaGeneral;
    }

    public void setTarifaGeneral(double tarifaGeneral) {
        this.tarifaGeneral = tarifaGeneral;
    }

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }
}