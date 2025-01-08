package com.example.demo.worker.currencyComparison;

import com.example.demo.controller.currencyComparison.dio.CurrencyComparisonInfoDio;
import com.example.demo.entity.CurrencyComparisonDo;
import com.example.demo.entity.repository.CurrencyComparisonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
public class CurrencyComparisonWorker {

    private final CurrencyComparisonRepository currencyComparisonRepository;

    public String findChineseNameByCurrency(String currency) {
        CurrencyComparisonDo currencyComparisonDo = currencyComparisonRepository.findByCurrency(currency);
        if (currencyComparisonDo == null) {
            return null;
        }
        return currencyComparisonDo.getChineseName();
    }

    public void createCurrencyComparisonInfo(CurrencyComparisonInfoDio input) {
        CurrencyComparisonDo currencyComparisonDo = new CurrencyComparisonDo();
        currencyComparisonDo.setCurrency(input.getCurrency());
        currencyComparisonDo.setChineseName(input.getChineseName());
        currencyComparisonRepository.save(currencyComparisonDo);
    }

    public CurrencyComparisonDo getCurrencyComparisonInfo(String currency) {
        return currencyComparisonRepository.findByCurrency(currency);
    }

    public CurrencyComparisonDo updateCurrencyComparisonInfo(CurrencyComparisonInfoDio input) {
        CurrencyComparisonDo currencyComparisonDo = currencyComparisonRepository.findByCurrency(input.getCurrency());
        if (currencyComparisonDo == null) {
            return null;
        }
        currencyComparisonDo.setChineseName(input.getChineseName());
        currencyComparisonRepository.save(currencyComparisonDo);

        return currencyComparisonRepository.findByCurrency(input.getCurrency());
    }

    @Transactional
    public void deleteCurrencyComparisonInfo(Long id) {
        currencyComparisonRepository.deleteById(id);
    }
}
