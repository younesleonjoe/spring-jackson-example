package com.younesleonjoe.springjacksonexample.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSerializer extends JsonSerializer<LocalDate> {

  //  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
  private final DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;

  @Override
  public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    gen.writeObject(formatter.format(value));
  }
}
