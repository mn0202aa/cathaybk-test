package com.example.demo.controller.coindesk.dto;

import lombok.Data;

import java.util.Map;

@Data
public class TransformCurrentpriceDto {

    private String updated;
    private Map<String, CurrencyInfoDto> currencyInfo;
}
