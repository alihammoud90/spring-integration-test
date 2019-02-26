package com.teltacworldwide.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "common", path = "/prefix",decode404 = true)
public interface PrefixClient {

}
