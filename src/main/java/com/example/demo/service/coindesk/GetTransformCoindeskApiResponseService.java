package com.example.demo.service.coindesk;

import com.example.demo.controller.coindesk.dto.CurrencyInfoDto;
import com.example.demo.controller.coindesk.dto.TransformCurrentpriceDto;
import com.example.demo.worker.currencyComparison.CurrencyComparisonWorker;
import com.example.demo.worker.rest.RestWorker;
import com.example.demo.worker.rest.dto.CurrentpriceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GetTransformCoindeskApiResponseService {

    private final RestWorker restWorker;
    private final CurrencyComparisonWorker currencyComparisonWorker;

    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    public TransformCurrentpriceDto transformCoindeskApiResponse() {
        CurrentpriceDto response = restWorker.callCoindeskApi();
        ZonedDateTime date = ZonedDateTime.parse(response.getTime().getUpdatedISO(), formatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        Map<String, CurrencyInfoDto> currencyInfoMap = new HashMap<>();
        if (response.getBpi() != null) {
            response.getBpi().forEach((currency, info) -> {
                CurrencyInfoDto currencyInfoDto = new CurrencyInfoDto();
                currencyInfoDto.setCurrency(currency);
                currencyInfoDto.setChineseName(currencyComparisonWorker.findChineseNameByCurrency(currency));
                currencyInfoDto.setExchangeRate(info.getRateFloat());
                currencyInfoMap.put(currency, currencyInfoDto);
            });
        }

        TransformCurrentpriceDto dto = new TransformCurrentpriceDto();
        dto.setUpdated(date.format(outputFormatter));
        dto.setCurrencyInfo(currencyInfoMap);
        return dto;
    }
}
