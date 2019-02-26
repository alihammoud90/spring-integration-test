package com.teltacworldwide.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "common", path = "/rateIncrements", decode404 = true)
public interface RateIncrementClient {

}

@Component
@Slf4j
class RateIncrementClientFallback  {

}
