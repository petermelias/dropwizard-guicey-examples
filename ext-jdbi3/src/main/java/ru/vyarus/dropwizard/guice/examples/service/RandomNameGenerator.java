package ru.vyarus.dropwizard.guice.examples.service;

/**
 * User name rundomizer. Used to demonstrate guice service injection into repository.
 *
 * @author Vyacheslav Rusakov
 * @since 01.11.2018
 */
public class RandomNameGenerator {

    public String generateName() {
        // implementation doesn't matter
        return "test" + Math.round(1000 * Math.random());
    }
}
