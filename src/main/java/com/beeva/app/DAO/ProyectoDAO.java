package com.beeva.app.DAO;

import com.beeva.app.Entidades.Proyecto;
import com.beeva.app.Utils.Conexion;
import org.sql2o.Connection;
import java.util.List;
import org.sql2o.Sql2o;

public class ProyectoDAO{

    private static Sql2o sql2o = Conexion.obtenerConexion();

    public List<Proyecto> obtenerTodosProyectos(){
        String query = "SELECT * FROM proyecto";
        try(Connection connect = sql2o.open()){
            return connect.createQuery(query).executeAndFetch(Proyecto.class);
        }
        //sql2o.cerrarConexion(connect);
    }

    public Proyecto getProyecto(String codigoProyecto) {
        String query = "SELECT * FROM proyecto WHERE codigoProyecto= :codigoProyecto";
        try (Connection connect = sql2o.open()) {
            return connect.createQuery(query).addParameter("codigoProyecto",codigoProyecto).executeAndFetchFirst(Proyecto.class);
        }
        //sql2o.cerrarConexion(connect);
    }
}