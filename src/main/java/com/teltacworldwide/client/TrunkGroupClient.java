package com.teltacworldwide.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "common",path = "/trunkgroup",decode404 = true)
public interface TrunkGroupClient {

}

@Component
@Slf4j
class TrunkGroupClientFallback  {

}
