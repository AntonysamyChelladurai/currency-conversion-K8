package com.jbeans.currencyconversion.proxy;

import com.jbeans.currencyconversion.dto.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//@FeignClient(name = "currency-exchange", url="http://currency-exc-service:8080")

@Component
//@FeignClient(name = "currency-exchange", url="http://localhost:8080")
//@FeignClient(name = "currency-exc-service") currency-exc-service
@FeignClient(name = "currency-exchange", url="http://currency-exc-service:8080")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchange(
            @PathVariable String from,
            @PathVariable String to);
}
