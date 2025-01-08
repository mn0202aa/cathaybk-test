package com.example.demo.worker.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrentpriceBpiDto {
    private String code;
    private String symbol;
    private String rate;
    private String description;

    @JsonProperty("rate_float")
    private Float rateFloat;
}
