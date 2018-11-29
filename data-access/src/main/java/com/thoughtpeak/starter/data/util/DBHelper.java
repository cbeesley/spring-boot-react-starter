package com.thoughtpeak.starter.data.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.postgresql.util.PGobject;

import java.sql.SQLException;
import java.util.Optional;

public class DBHelper {

    /**
     * Generates a PGobject for using in the json column type
     *
     * @param object - An object that you want to convert to the json db type
     * @return
     */
    public static Optional<PGobject> getPGObject(Object object){

        ObjectMapper mapper = new ObjectMapper();
        PGobject jsonObject = new PGobject();
        jsonObject.setType("json");
        try {
            jsonObject.setValue(mapper.writeValueAsString(object));
        } catch (SQLException e) {
            e.printStackTrace();
            Optional.empty();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return Optional.empty();
        }

        return Optional.of(jsonObject);
    }
}
