package com.example.demo.service.coindesk;

import com.example.demo.worker.rest.RestWorker;
import com.example.demo.worker.rest.dto.CurrentpriceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetCoindeskApiResponseService {

    private final RestWorker restWorker;

    public CurrentpriceDto getCoindeskApiResponse() {
        return restWorker.callCoindeskApi();
    }
}
