package com.younesleonjoe.springjacksonexample.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

  //  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

  private final DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;

  public LocalDateDeserializer() {
    this(null);
  }

  protected LocalDateDeserializer(Class<?> vc) {
    super(vc);
  }

  @Override
  public LocalDate deserialize(JsonParser jsonParser, DeserializationContext context)
      throws IOException {
    String localDate = jsonParser.getText();
    return LocalDate.parse(localDate, formatter);
  }
}
