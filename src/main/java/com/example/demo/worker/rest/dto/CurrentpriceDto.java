package com.example.demo.worker.rest.dto;

import lombok.Data;

import java.util.Map;

@Data
public class CurrentpriceDto {
    private CurrentpriceTimeDto time;
    private String disclaimer;
    private String chartName;
    private Map<String, CurrentpriceBpiDto> bpi;
}
