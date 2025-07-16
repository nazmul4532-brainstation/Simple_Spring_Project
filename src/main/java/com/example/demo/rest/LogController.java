package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String generateLogs() {
        logger.info("This is an info log message.");
        logger.warn("This is a warning log message.");
        logger.error("This is an error log message.");
        return "Logs generated!";
    }
}
