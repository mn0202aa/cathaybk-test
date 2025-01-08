package com.example.demo.controller.currencyComparison;

import com.example.demo.controller.currencyComparison.dio.CurrencyComparisonInfoDio;
import com.example.demo.entity.CurrencyComparisonDo;
import com.example.demo.service.currencyComparison.CreateCurrencyComparisonInfoService;
import com.example.demo.service.currencyComparison.DeleteCurrencyComparisonInfoService;
import com.example.demo.service.currencyComparison.GetCurrencyComparisonInfoService;
import com.example.demo.service.currencyComparison.UpdateCurrencyComparisonInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("currency-comparison")
@RequiredArgsConstructor
public class CurrencyComparisonController {

    private final GetCurrencyComparisonInfoService getCurrencyComparisonInfoService;

    @GetMapping
    public CurrencyComparisonDo getCurrencyComparisonInfo(
            @RequestParam(name = "currency") String currency) {
        return getCurrencyComparisonInfoService.getCurrencyComparisonInfo(currency);
    }

    private final CreateCurrencyComparisonInfoService createCurrencyComparisonInfoService;

    @PostMapping
    public void createCurrencyComparisonInfo(
            @RequestBody CurrencyComparisonInfoDio input) {
        createCurrencyComparisonInfoService.createCurrencyComparisonInfo(input);
    }

    private final UpdateCurrencyComparisonInfoService updateCurrencyComparisonInfoService;

    @PatchMapping
    public CurrencyComparisonDo updateCurrencyComparisonInfo(
            @RequestBody CurrencyComparisonInfoDio input) {
        return updateCurrencyComparisonInfoService.updateCurrencyComparisonInfo(input);
    }

    private final DeleteCurrencyComparisonInfoService deleteCurrencyComparisonInfoService;

    @DeleteMapping(path = "/{id}")
    public void deleteCurrencyComparisonInfo(
            @PathVariable Long id) {
        deleteCurrencyComparisonInfoService.deleteCurrencyComparisonInfo(id);
    }
}

