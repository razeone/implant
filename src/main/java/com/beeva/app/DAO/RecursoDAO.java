package com.beeva.app.DAO;

import com.beeva.app.Entidades.Recurso;
import com.beeva.app.Utils.Conexion;
import org.sql2o.Connection;
import java.util.List;
import org.sql2o.Sql2o;

public class RecursoDAO{

    private static Sql2o sql2o = Conexion.obtenerConexion();

    public List<Recurso> obtenerTodosRecursos(){
        String query = "SELECT * FROM recurso";
        try(Connection connect = sql2o.open()){
            return connect.createQuery(query).executeAndFetch(Recurso.class);
        }
        //sql2o.cerrarConexion(connect);
    }

    public Recurso getRecurso(String codigoRecurso) {
        String query = "SELECT * FROM recurso WHERE codigoRecurso= :codigoRecurso";
        try (Connection connect = sql2o.open()) {
            return connect.createQuery(query).addParameter("codigoRecurso",codigoRecurso).executeAndFetchFirst(Recurso.class);
        }
        //sql2o.cerrarConexion(connect);
    }
}