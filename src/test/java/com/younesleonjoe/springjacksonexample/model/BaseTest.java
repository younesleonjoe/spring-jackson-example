package com.younesleonjoe.springjacksonexample.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

  BeerDTO getBeerDTO() {
    return BeerDTO.builder()
        .beerName("BeerName")
        .beerStyle("Ale")
        .id(UUID.randomUUID())
        .createdAt(OffsetDateTime.now())
        .updatedAt(OffsetDateTime.now())
        .price(new BigDecimal("12.99"))
        .upc(123123123123L)
        .myLocalDate(LocalDate.now())
        .build();
  }
}
