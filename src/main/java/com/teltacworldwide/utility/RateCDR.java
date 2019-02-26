package com.teltacworldwide.utility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.transformer.AbstractTransformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class RateCDR extends AbstractTransformer {

    @Override
    protected Object doTransform(Message<?> message) throws Exception {
        return null;
    }
}
