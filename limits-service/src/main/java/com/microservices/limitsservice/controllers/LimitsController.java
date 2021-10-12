package com.microservices.limitsservice.controllers;

import com.microservices.limitsservice.bean.Limits;
import com.microservices.limitsservice.config.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return new Limits(2, 998);
    }
}
