package com.fl.sourabh.footballleague.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Country {
  @JsonProperty("country_id")
  private int id;
  @JsonProperty("country_name")
  private String name;
}
