package com.example.demo.service.currencyComparison;

import com.example.demo.controller.currencyComparison.dio.CurrencyComparisonInfoDio;
import com.example.demo.worker.currencyComparison.CurrencyComparisonWorker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCurrencyComparisonInfoService {

    private final CurrencyComparisonWorker currencyComparisonWorker;

    public void createCurrencyComparisonInfo(CurrencyComparisonInfoDio input) {
        currencyComparisonWorker.createCurrencyComparisonInfo(input);
    }
}
