package com.teltacworldwide.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * Created by User on 3/29/2018.
 */
@FeignClient(name = "rate-buy", decode404 = true)
public interface RateBuyClient {

}

@Component
@Slf4j
class RateBuyClientFallback {

}
