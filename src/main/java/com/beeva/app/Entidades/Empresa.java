package com.beeva.app.Entidades;

public class Empresa{

    private String codigoempresa;
    private String nombreempresa;
    private String estatusempresa;
    private double tarifageneral;
    private int idmoneda;

    public String getCodigoempresa() {
        return codigoempresa;
    }

    public void setCodigoempresa(String codigoempresa) {
        this.codigoempresa = codigoempresa;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getEstatusempresa() {
        return estatusempresa;
    }

    public void setEstatusempresa(String estatusempresa) {
        this.estatusempresa = estatusempresa;
    }

    public double getTarifageneral() {
        return tarifageneral;
    }

    public void setTarifageneral(double tarifageneral) {
        this.tarifageneral = tarifageneral;
    }

    public int getIdmoneda() {
        return idmoneda;
    }

    public void setIdmoneda(int idmoneda) {
        this.idmoneda = idmoneda;
    }
}