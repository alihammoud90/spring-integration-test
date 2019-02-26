package com.teltacworldwide.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "common", path = "/countrycode",decode404 = true)
public interface CountryCodeClient {

}
