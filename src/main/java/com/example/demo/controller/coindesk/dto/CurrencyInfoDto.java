package com.example.demo.controller.coindesk.dto;

import lombok.Data;

@Data
public class CurrencyInfoDto {

    private String currency;
    private String chineseName;
    private Float exchangeRate;
}
