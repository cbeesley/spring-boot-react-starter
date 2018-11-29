package com.thoughtpeak.starter.data.converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.thoughtpeak.starter.model.ui.User;

import javax.persistence.AttributeConverter;
import java.io.IOException;
import java.util.Optional;

/**
 * Converts the json type into a json object in the field
 */
public class UserJsonConverter implements
        AttributeConverter<Optional<User>, String> {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Optional<User> config) {

        String o = "";
        try {
            o = mapper.writeValueAsString(config);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public Optional<User> convertToEntityAttribute(String source) {


        if(Strings.isNullOrEmpty(source)){
            return Optional.empty();
        }
        try {
            return Optional.of(mapper.readValue(source,User.class));
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
