package com.beeva.app.DAO;

import com.beeva.app.Entidades.Empresa;
import com.beeva.app.Utils.Conexion;
import org.sql2o.Connection;
import java.util.List;
import org.sql2o.Sql2o;

public class EmpresaDAO{

    private static Sql2o sql2o = Conexion.obtenerConexion();

    public List<Empresa> obtenerTodasEmpresas(){
        String query = "SELECT * FROM empresa";
        try(Connection connect = sql2o.open()){
            return connect.createQuery(query).executeAndFetch(Empresa.class);
        }
        //sql2o.cerrarConexion(connect);
    }

    public Empresa getEmpresa(String codigoEmpresa) {
        String query = "SELECT * FROM empresa WHERE codigoEmpresa= :codigoEmpresa";
        try (Connection connect = sql2o.open()) {
            return connect.createQuery(query).addParameter("codigoEmpresa",codigoEmpresa).executeAndFetchFirst(Empresa.class);
        }
        //sql2o.cerrarConexion(connect);
    }
}