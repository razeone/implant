package com.beeva.app.DAO;

import com.beeva.app.Entidades.Usuario;
import com.beeva.app.Utils.Conexion;
import org.sql2o.Connection;
import java.util.List;
import org.sql2o.Sql2o;

public class UsuarioDAO{

    private static Sql2o sql2o = Conexion.obtenerConexion();

    public List<Usuario> obtenerTodosUsuarios(){
        String query = "SELECT * FROM usuario";
        try(Connection connect = sql2o.open()){
            return connect.createQuery(query).executeAndFetch(Usuario.class);
        }
        //sql2o.cerrarConexion(connect);
    }

    public Recurso getUsuario(int idUsuario) {
        String query = "SELECT * FROM usuario WHERE idUsuario = :idUsuario";
        try (Connection connect = sql2o.open()) {
            return connect.createQuery(query).addParameter("idUsuario",idUsuario).executeAndFetchFirst(Usuario.class);
        }
        //sql2o.cerrarConexion(connect);
    }
}