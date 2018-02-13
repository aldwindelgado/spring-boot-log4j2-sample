package com.github.aldwindelgado.springbootlog4j2sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4j2SampleApplication {

//    https://www.callicoder.com/spring-boot-log4j-2-example/
    private static final Logger LOGGER = LogManager.getLogger(SpringBootLog4j2SampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLog4j2SampleApplication.class, args);

        LOGGER.info("Info log sample");
        LOGGER.error("Error log sample"); // This line should send an email
//        LOGGER.debug("Debug log sample");
//        LOGGER.trace("Trace log sample");
//        LOGGER.fatal("Fatal log sample");

//        LOGGER.info("Info log sample: {}", "Hi there!");
//        LOGGER.error("Error log sample: {}", "Hi there!");
//        LOGGER.debug("Debug log sample: {}", "Hi there!");
//        LOGGER.trace("Trace log sample: {}", "Hi there!");
//        LOGGER.fatal("Fatal log sample: {}", "Hi there!");

        throw new IllegalArgumentException("Testing SMTP email"); // This will not send an email
    }
}
