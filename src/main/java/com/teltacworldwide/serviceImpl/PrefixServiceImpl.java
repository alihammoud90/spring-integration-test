package com.teltacworldwide.serviceImpl;

import com.teltacworldwide.client.PrefixClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service("prefixService")
@Slf4j
public class PrefixServiceImpl {


    private final PrefixClient prefixClient;

    public PrefixServiceImpl(PrefixClient prefixClient) {
        this.prefixClient = prefixClient;
    }

}
