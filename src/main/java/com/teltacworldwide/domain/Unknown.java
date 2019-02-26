package com.teltacworldwide.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "unknown")
@Data
public class Unknown {
    private int country;
    private int operator;
    private int carrier;
    private int blank;
}
