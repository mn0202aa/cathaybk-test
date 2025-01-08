package com.example.demo.service.currencyComparison;

import com.example.demo.entity.CurrencyComparisonDo;
import com.example.demo.worker.currencyComparison.CurrencyComparisonWorker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetCurrencyComparisonInfoService {

    private final CurrencyComparisonWorker currencyComparisonWorker;

    public CurrencyComparisonDo getCurrencyComparisonInfo(String currency) {
        return currencyComparisonWorker.getCurrencyComparisonInfo(currency);
    }
}
