package com.javierdearcos.challenge.java8.episode1;

/**
 * Empire most powerful spaceship with more than 160 kilometers (99 mi) in diameter, and is crewed by an estimated 1.7
 * million military personnel and 400,000 droids. It is equipped with a superlaser capable of destroying an entire
 * planet.
 */
public interface DeathStar extends Spaceship{

    /**
     * Start charging the superlaser. This operation requires a significant time.
     */
    void chargeSuperLaser();

    /**
     * Returns true if, and only if, the superlaser is charged.
     * @return <code>true</code> if the superlaser is charged, otherwise <code>false</code>.
     */
    boolean isCharged();

    /**
     * Destroy an entire planet. It is 100% effective.
     * @param planet Planet to destroy.
     */
    void destroyPlanet(Planet planet);
}
