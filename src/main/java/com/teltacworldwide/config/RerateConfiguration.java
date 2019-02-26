package com.teltacworldwide.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.handler.DelayHandler;
import org.springframework.scheduling.TaskScheduler;

@Configuration
public class RerateConfiguration {

    private final TaskScheduler taskScheduler;

    public RerateConfiguration(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    //Used in order to wait for all batches of rerated CDRs to be saved (and to avoid loop again over list of filteredCDRs after aggregator)
    @Bean
//    @PostConstruct
    @ServiceActivator(inputChannel = "rerateDelayerChannel")
    public DelayHandler customRerateDelayer() {
        DelayHandler handler = new DelayHandler("delayer.messageGroupId", taskScheduler);
        handler.setDefaultDelay(15000L);
        return handler;
    }
}
