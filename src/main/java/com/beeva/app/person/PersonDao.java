package com.beeva.app.person;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;
import java.io.StringWriter;
import java.io.IOException;

public class PersonDao {
    final static String DB_URL = "jdbc:postgresql://localhost/implant";
    final static String USER = "implant";
    final static String PASS = "implant";

    private static Sql2o sql2o;

    static{
        sql2o = new Sql2o(DB_URL, USER, PASS);
    }

    public List<Person> getAllPersons(){
        String sql =
                "SELECT id, name " +
                        "FROM person";

        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Person.class);
        }
    }

    public static String dataToJson(Object data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            StringWriter sw = new StringWriter();
            mapper.writeValue(sw, data);
            return sw.toString();
        } catch (IOException e){
            throw new RuntimeException("IOException from a StringWriter?");
        }
    }
}
