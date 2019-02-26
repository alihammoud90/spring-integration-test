package com.teltacworldwide.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "common", path = "/operatorcode",decode404 = true)
public interface OperatorCodeClient {

}
