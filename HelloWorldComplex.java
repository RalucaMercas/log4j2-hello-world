package com.example.training;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Objective: Make me run!
 */
public class HelloWorldComplex {
    private static final String SOMETHING_TO_PRINT = "Oh my my...";
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldComplex.class);

    public static void main(String[] args) {
        LOG.info(SOMETHING_TO_PRINT);
    }
}