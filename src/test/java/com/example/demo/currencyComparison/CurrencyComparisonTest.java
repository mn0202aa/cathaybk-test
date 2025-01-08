package com.example.demo.currencyComparison;

import com.example.demo.controller.currencyComparison.dio.CurrencyComparisonInfoDio;
import com.example.demo.service.currencyComparison.CreateCurrencyComparisonInfoService;
import com.example.demo.service.currencyComparison.DeleteCurrencyComparisonInfoService;
import com.example.demo.service.currencyComparison.GetCurrencyComparisonInfoService;
import com.example.demo.service.currencyComparison.UpdateCurrencyComparisonInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CurrencyComparisonTest {

    @Autowired
    private CreateCurrencyComparisonInfoService createCurrencyComparisonInfoService;

    @Test
    public void testCreateCurrencyComparisonInfoService() {
        CurrencyComparisonInfoDio input = new CurrencyComparisonInfoDio();
        input.setCurrency("USD");
        input.setChineseName("美元");
        createCurrencyComparisonInfoService.createCurrencyComparisonInfo(input);
    }

    @Autowired
    private GetCurrencyComparisonInfoService getCurrencyComparisonInfoService;

    @Test
    public void testGetCurrencyComparisonInfoService() {
        System.out.println(getCurrencyComparisonInfoService.getCurrencyComparisonInfo("USD"));
    }

    @Autowired
    private UpdateCurrencyComparisonInfoService updateCurrencyComparisonInfoService;

    @Test
    public void testUpdateCurrencyComparisonInfoService() {
        CurrencyComparisonInfoDio input = new CurrencyComparisonInfoDio();
        input.setCurrency("USD");
        input.setChineseName("美金");
        System.out.println(updateCurrencyComparisonInfoService.updateCurrencyComparisonInfo(input));
    }

    @Autowired
    private DeleteCurrencyComparisonInfoService deleteCurrencyComparisonInfoService;

    @Test
    public void testDeleteCurrencyComparisonInfoService() {
        deleteCurrencyComparisonInfoService.deleteCurrencyComparisonInfo(1L);
    }
}
