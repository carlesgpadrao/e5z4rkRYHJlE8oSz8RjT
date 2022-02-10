package com.javierdearcos.challenge.java8.episode1;

/**
 * A Planet represents a large natural object that orbit, or travel around, stars. It might support life.
 */
public interface Planet {

    /**
     * Receives a hit that destroys the planet.
     */
    void destroy();

    /**
     * Returns true if, and only if, the spaceship is destroyed.
     * @return <code>true</code> if the spaceship is destroyed, otherwise <code>false</code>.
     */
    boolean isDestroyed();
}
