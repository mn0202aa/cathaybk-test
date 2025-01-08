package com.example.demo.service.currencyComparison;

import com.example.demo.controller.currencyComparison.dio.CurrencyComparisonInfoDio;
import com.example.demo.entity.CurrencyComparisonDo;
import com.example.demo.worker.currencyComparison.CurrencyComparisonWorker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCurrencyComparisonInfoService {

    private final CurrencyComparisonWorker currencyComparisonWorker;

    public CurrencyComparisonDo updateCurrencyComparisonInfo(CurrencyComparisonInfoDio input) {
        return currencyComparisonWorker.updateCurrencyComparisonInfo(input);
    }
}
