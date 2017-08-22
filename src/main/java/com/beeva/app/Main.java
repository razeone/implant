package com.beeva.app;
import static spark.Spark.*;
import com.beeva.app.DAO.*;
import com.beeva.app.Utils.Format;

public class Main {
    public static void main(String[] args) {
        //todos los recursos
        get("/recurso", (req, res) -> {
            RecursoDAO dao = new RecursoDAO();
            res.status(200);
            res.type("application/json");
            return Format.dataToJson(dao.obtenerTodosRecursos());
        });
        //recurso en particular
        get("/recurso/:codigoRecurso", (req, res) -> {
            RecursoDAO dao = new RecursoDAO();
            res.status(200);
            res.type("application/json");
            return Format.dataToJson(dao.getRecurso(req.params(":codigoRecurso")));
        });
        //todas las empresas
        get("/empresa", (req, res) -> {
            EmpresaDAO dao = new EmpresaDAO();
            res.status(200);
            res.type("application/json");
            return Format.dataToJson(dao.obtenerTodasEmpresas());
        });
        //empresa en particular
        get("/empresa/:codigoEmpresa", (req, res) -> {
            EmpresaDAO dao = new EmpresaDAO();
            res.status(200);
            res.type("application/json");
            return Format.dataToJson(dao.getEmpresa(req.params(":codigoEmpresa")));
        });
        //todas los proyectos
        get("/proyecto", (req, res) -> {
            ProyectoDAO dao = new ProyectoDAO();
            res.status(200);
            res.type("application/json");
            return Format.dataToJson(dao.obtenerTodosProyectos());
        });
        //empresa en particular
        get("/proyecto/:codigoProyecto", (req, res) -> {
            ProyectoDAO dao = new ProyectoDAO();
            res.status(200);
            res.type("application/json");
            return Format.dataToJson(dao.getProyecto(req.params(":codigoProyecto")));
        });
    }
}
