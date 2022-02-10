package com.javierdearcos.challenge.java8.episode1;

/**
 * A Commander represents  person in authority that is able to request new troops to fight in battle.
 */
public interface Commander {

    /**
     * Request a new spaceship to fight in battle.
     * @return A new spaceship or <code>null</code> if no one is available.
     */
    Spaceship requestSpaceship();
}
