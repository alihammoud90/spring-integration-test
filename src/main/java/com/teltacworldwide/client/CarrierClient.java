package com.teltacworldwide.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "common", path = "/carrier",decode404 = true)
public interface CarrierClient {

}

@Component
@Slf4j
class CarrierClientFallback {

}


