package com.teltacworldwide.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * Created by User on 3/29/2018.
 */
@FeignClient(name = "rate-sell", decode404 = true, fallback = RateSellClientFallback.class)
public interface RateSellClient {

}

@Component
@Slf4j
class RateSellClientFallback {
}
