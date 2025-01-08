package com.example.demo.controller.coindesk;

import com.example.demo.controller.coindesk.dto.TransformCurrentpriceDto;
import com.example.demo.service.coindesk.GetCoindeskApiResponseService;
import com.example.demo.service.coindesk.GetTransformCoindeskApiResponseService;
import com.example.demo.worker.rest.dto.CurrentpriceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coindesk")
@RequiredArgsConstructor
public class CoindeskController {

    private final GetCoindeskApiResponseService getCoindeskApiResponseService;

    @GetMapping("api")
    public CurrentpriceDto getCoindeskApiResponse() {
        return getCoindeskApiResponseService.getCoindeskApiResponse();
    }

    private final GetTransformCoindeskApiResponseService getTransformCoindeskApiResponseService;

    @GetMapping("transform")
    public TransformCurrentpriceDto getTransformCoindeskApiResponse() {
        return getTransformCoindeskApiResponseService.transformCoindeskApiResponse();
    }
}
