package com.younesleonjoe.springjacksonexample.model;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDTOTest extends BaseTest {

  @Autowired ObjectMapper mapper;

  @Test
  void testSerialize() throws Exception {
    BeerDTO beerDTO = getBeerDTO();
    String beerDTOJSON = mapper.writeValueAsString(beerDTO);

    System.out.println(beerDTOJSON);
  }

  @Test
  void testDeserialize() throws Exception {
    String beerDTOJSON =
        "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdAt\":\"2024-04-10T01:05:35+0300\",\"updatedAt\":\"2024-04-10T01:05:35.550329859+03:00\",\"myLocalDate\":\"20240410\",\"beerId\":\"657da3a4-b969-403a-9d5e-ba64490bfb69\"}";
    BeerDTO beerDTO = mapper.readValue(beerDTOJSON, BeerDTO.class);

    System.out.println(beerDTO);
  }
}
