package com.javierdearcos.challenge.java8.episode1.internal;

import com.javierdearcos.challenge.java8.episode1.Commander;
import com.javierdearcos.challenge.java8.episode1.Spaceship;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Commander of the Rebel Alliance forces.
 */
public class RebelAllianceCommander implements Commander {

    private static final double COMMUNICATION_ERROR = 0.1;

    private List<Spaceship> spaceships;
    private int counter = 0;

    public RebelAllianceCommander(int numberOfSpaceships) {
        this.spaceships = IntStream.of(numberOfSpaceships).mapToObj(v -> new XWing()).collect(Collectors.toList());
    }

    @Override
    public Spaceship requestSpaceship() {
        spaceships = spaceships.stream().filter(spaceship -> !spaceship.isDestroyed()).collect(Collectors.toList());

        if (Math.random() >= COMMUNICATION_ERROR && spaceships.size() > 0) {
            return spaceships.get(counter++ % spaceships.size());
        }

        return null;
    }
}
