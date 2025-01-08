package com.example.demo.coindesk;

import com.example.demo.service.coindesk.GetCoindeskApiResponseService;
import com.example.demo.service.coindesk.GetTransformCoindeskApiResponseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CoindeskTest {

    @Autowired
    private GetCoindeskApiResponseService getCoindeskApiResponseService;

    @Test
    public void testGetCoindeskApiResponseService() {
        System.out.println(getCoindeskApiResponseService.getCoindeskApiResponse());
    }

    @Autowired
    private GetTransformCoindeskApiResponseService getTransformCoindeskApiResponseService;

    @Test
    public void testGetTransformCoindeskApiResponseService() {
        System.out.println(getTransformCoindeskApiResponseService.transformCoindeskApiResponse());
    }
}
