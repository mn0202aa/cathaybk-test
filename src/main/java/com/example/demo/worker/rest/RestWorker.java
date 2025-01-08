package com.example.demo.worker.rest;

import com.example.demo.worker.rest.dto.CurrentpriceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
@RequiredArgsConstructor
public class RestWorker {

    private final RestTemplate restTemplate = new RestTemplate();

    public CurrentpriceDto callCoindeskApi() {
        String url = "https://api.coindesk.com/v1/bpi/currentprice.json";
        CurrentpriceDto response = restTemplate.getForObject(url, CurrentpriceDto.class);
        return response;
    }
}
