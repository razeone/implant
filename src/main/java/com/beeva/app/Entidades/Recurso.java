package com.beeva.app.Entidades;

public class Recurso{

    private String codigorecurso;
    private String nombrerecurso;
    private String apellidopaterno;
    private String apellidomaterno;
    private String estadorecurso;

    public String getCodigorecurso() {
        return codigorecurso;
    }

    public void setCodigorecurso(String codigorecurso) {
        this.codigorecurso = codigorecurso;
    }

    public String getNombrerecurso() {
        return nombrerecurso;
    }

    public void setNombrerecurso(String nombrerecurso) {
        this.nombrerecurso = nombrerecurso;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getEstadorecurso() {
        return estadorecurso;
    }

    public void setEstadorecurso(String estadorecurso) {
        this.estadorecurso = estadorecurso;
    }
}