package com.example.demo.service.currencyComparison;

import com.example.demo.worker.currencyComparison.CurrencyComparisonWorker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCurrencyComparisonInfoService {

    private final CurrencyComparisonWorker currencyComparisonWorker;

    public void deleteCurrencyComparisonInfo(Long id) {
        currencyComparisonWorker.deleteCurrencyComparisonInfo(id);
    }
}
