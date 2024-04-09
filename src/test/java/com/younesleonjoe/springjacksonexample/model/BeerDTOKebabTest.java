package com.younesleonjoe.springjacksonexample.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDTOKebabTest extends BaseTest {

  @Autowired private ObjectMapper mapper;

  @Test
  void testSerialize() throws Exception {
    BeerDTO beerDTO = getBeerDTO();
    String beerDTOJSON = mapper.writeValueAsString(beerDTO);

    System.out.println(beerDTOJSON);
  }
}
