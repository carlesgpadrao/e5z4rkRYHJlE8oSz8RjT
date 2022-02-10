package com.javierdearcos.challenge.java8.episode1.internal;

import com.javierdearcos.challenge.java8.episode1.Planet;

/**
 * Default implementation of a planet.
 */
public class DefaultPlanet implements Planet {

    private final String name;
    private final String location;
    private final String type;
    private final boolean inhabited;
    private boolean destroyed;

    public DefaultPlanet(String name, String location, String type, boolean inhabited) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.inhabited = inhabited;
    }

    @Override
    public void destroy() {
        destroyed = true;
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public String toString() {
        return "DefaultPlanet{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", inhabited=" + inhabited +
                ", destroyed=" + destroyed +
                '}';
    }
}
