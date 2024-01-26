package it.revo.Online.food.order.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

import javax.persistence.AttributeConverter;

@Configuration
public class JpaConverterJson implements AttributeConverter<Object, String> {


    private static final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public String convertToDatabaseColumn(Object o) {
        try {
            return objectMapper.writeValueAsString(o);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object convertToEntityAttribute(String s) {
        try {
            return objectMapper.readValue(s, Object.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
