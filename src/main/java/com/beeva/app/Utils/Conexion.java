package com.beeva.app.Utils;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class Conexion{

    final static String DB_URL = "jdbc:postgresql://localhost/implant";
    final static String USER = "implantdb";
    final static String PASS = "b33v42017!";
    private static Sql2o sql2o;

    public static Sql2o obtenerConexion(){
            return new Sql2o(DB_URL, USER, PASS);
    }

    public void cerrarConexion(Connection con){
        con.close();
    }
}