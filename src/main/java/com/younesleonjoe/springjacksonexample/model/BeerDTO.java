package com.younesleonjoe.springjacksonexample.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.younesleonjoe.springjacksonexample.serialization.LocalDateDeserializer;
import com.younesleonjoe.springjacksonexample.serialization.LocalDateSerializer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

  @JsonProperty("beerId") // will override Jackson strategy
  @Null
  private UUID id;

  @NotBlank private String beerName;

  @NotBlank private String beerStyle;

  @Positive private Long upc;

  @JsonFormat(shape = JsonFormat.Shape.STRING)
  private BigDecimal price;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
  private OffsetDateTime createdAt;

  private OffsetDateTime updatedAt;

  @JsonSerialize(using = LocalDateSerializer.class)
  @JsonDeserialize(using = LocalDateDeserializer.class)
  private LocalDate myLocalDate;
}
