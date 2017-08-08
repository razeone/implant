package com.beeva.app;
import static spark.Spark.*;
import com.beeva.app.person.PersonDao;

public class Main {
    public static void main(String[] args) {
        get("/person", (req, res) -> {
            PersonDao dao = new PersonDao();
            res.status(200);
            res.type("application/json");
            return PersonDao.dataToJson(dao.getAllPersons());
        });
    }
}
